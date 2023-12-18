package Baza;

import java.util.Scanner;

/**
 * Created by yriaven on 10.06.17.
 */
public class A {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        int a = skan.nextInt();
        int b = skan.nextInt();

        int wynik = a+b;


        if (wynik >= 10)
        {
            System.out.println("error");
        }
        else System.out.println(wynik);
    }
}
