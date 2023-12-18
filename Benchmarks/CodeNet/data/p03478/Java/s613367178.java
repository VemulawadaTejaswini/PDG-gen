

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a, b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
//        n = 20;
//        a = 2;
//        b = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int ans = 0;
            int tmp = 1;
            int num = i;
            for (int j = 0; j < 4; j++) {
                tmp *= 10;

                ans += (num % tmp) / (tmp / 10);
                num -= num % tmp;
            }
            if (ans >= a && ans <= b) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
