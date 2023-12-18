
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static final int mod = (int) (1e9 + 7);

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] cnt = new int[k + 1];
        int ans = 0;
        for (int i = k; i > 0; i--) {
            cnt[i] = modPow(k / i, n);
            for (int j = i + i; j <= k; j += i)
                cnt[i] = add(cnt[i], -cnt[j]);
            ans = add(ans,mult(i,cnt[i]));
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static int modPow(int b, int e) {
        int res = 1;
        while (e > 0) {
            if (e % 2 != 0) res = mult(res, b);
            b = mult(b, b);
            e >>= 1;
        }
        return res;
    }

    static int add(int a, int b) {
        int c = a + b;
        if (c >= mod) c -= mod;
        if (c < 0) c += mod;
        return c;
    }

    static int mult(long a, int b) {
        return (int) (a * b % mod);
    }

    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        boolean ready() throws IOException {
            return br.ready();
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        int nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

    }
}
