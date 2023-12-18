package j.hiro.practice;

import java.util.Scanner;

/**
 * Rounding
 */
public class Main {

    public static void main(String... args) {
        // 標準入力から読み取り
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        sc.close();

        /* xがa未満であれば0を、a以上の時に10を出力 */
        // System.out.println(x < a ? 0 : 10);
        if(x < a) System.out.println(0);
        else System.out.println(10);
    }
}