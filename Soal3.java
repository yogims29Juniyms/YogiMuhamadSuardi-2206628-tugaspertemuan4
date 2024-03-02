/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4pbo;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        int nilaiA = a;
        int nilaiB = b;

        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        System.out.println("Pembagi Bersama Terbesar dari " + nilaiA + " dan " + nilaiB + " adalah " + a);
    }
}

