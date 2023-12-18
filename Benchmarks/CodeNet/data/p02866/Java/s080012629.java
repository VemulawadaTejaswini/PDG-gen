import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        Arrays.sort(d);

        if (d[0] != 0) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        int cnt1 = 1;
        int cnt2 = 1;
        for (int i = 1; i < n; i++) {
            if (d[i] == d[i-1]) {
                cnt2++;
                continue;
            }

            if (d[i-1] != 0)
                ans = ans * exp(cnt1, cnt2) % 998244353;

            cnt1 = cnt2;
            cnt2 = 1;
        }
        // last one
        ans = ans * exp(cnt1, cnt2) % 998244353;

        System.out.println(ans % 998244353);
    }


    // aのb乗を計算する(998244353で割った値を返す)
    static long exp(int a, int b) {
        long tmp = a;
        for (int i = 2; i <= b; i++) {
            tmp = tmp * a % 998244353;
        }

        return tmp % 998244353;
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}