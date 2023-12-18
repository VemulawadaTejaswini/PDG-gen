import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // 攻撃に耐えれる回数
        int takahashi = a / d;
        int aoki = c / b;

        int std = Math.min(takahashi, aoki);

        int takaHP = a - d * std;
        int aoHP = c - b * std;

        if (std == 1) {
            if (c-b <= 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (takaHP <= 0) {
                System.out.println("No");
            } else if (aoHP - b <= 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}