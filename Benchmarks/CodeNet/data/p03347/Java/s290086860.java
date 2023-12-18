package jp.llv.atcoder;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int length = in.nextInt();
        if (in.nextInt() > 0) {
            System.out.println(-1);
            return;
        }
        long ans = 0;
        int prev = 0;
        for (int i = 1; i < length; i++) {
            int n = in.nextInt();
            if (n == 0) {
            } else if (n - prev > 1) {
                System.out.println(-1);
                return;
            } else if (n - prev == 1) {
                ans++;
            } else if (n - prev <= 0) {
                ans += n;
            }
            prev = n;
        }
        System.out.println(ans);
    }
}
