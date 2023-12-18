
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long w = sc.nextLong();
        item[] is = new item[n];
        long base = sc.nextLong();
        int diff;
        if (base == 1) {
            diff = 1;
        } else if (base == 2) {
            diff = 2;
        } else
            diff = 3;
        is[0] = new item((int)0, sc.nextLong());
        for (int i = 1; i < n; i++) {
            is[i] = new item((int)(sc.nextLong() - base), sc.nextLong());
        }
        long[][] dp = new long[n+1][3*n+1+diff];
        for (int i = 1; i < dp.length; i++) {
            item trg = is[i-1];
            for (int j = 0; j < dp[0].length; j++) {
                if (j - trg.weight - diff < 0) {
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],
                                        dp[i-1][j- diff -trg.weight] + trg.value);
                }
            }
        }

//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                System.out.printf("%d\t", dp[i][j]);
//            }
//            System.out.println();
//        }

        long ans = 0;
        for (int j = 0; j < dp[n].length && j + base - diff <= w; j++) {
            if (dp[n][j] > ans)
                ans = dp[n][j];
        }
        System.out.println(ans);
    }

    static class item {
        int weight;
        long value;
        item(int w, long v) {
            weight = w;
            value = v;
        }
    }

}
