

import java.util.Scanner;

public class Main {
    public static int MAX = 100000;
    public static int n, k;
    public static long[] T = new long[MAX];

    // 最大積載量Pのk題のトラックで何個の荷物を積めるか
    public static int check(long P) {
        int i = 0;
        for(int j = 0; j < k; j++) {
            long s = 0;
            while(s + T[i] <= P)
            {
                s += T[i];
                i++;
                if(i == n) return n;
            }
        }
        return i;
    }

    public static int solve() {
        long left = 0;
        long right = 100000 * 10000;
        long mid;
        while(right - left > 1)
        {
            mid = (left + right) / 2;
            int v = check(mid);
            if(v >= n) right = mid;
            else left = mid;
        }
        return (int)right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < n; i++) T[i] = sc.nextInt();
        long ans = solve();
        System.out.println(ans);
    }
}

