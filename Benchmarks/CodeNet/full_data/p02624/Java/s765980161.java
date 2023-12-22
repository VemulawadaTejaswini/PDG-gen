

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long ans = calc(n);
        System.out.println(ans);
    }

    private static long calc(int n) {
        long[] memo = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (i * j <= n) {
                memo[i * j]++;
                j++;
            }
        }
        long sum = 0;
        for (int i = 1; i < memo.length; i++) {
            sum += i * memo[i];
        }
        return sum;
    }

}