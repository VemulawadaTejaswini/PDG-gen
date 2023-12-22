import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    private static long readLong() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Long.parseLong(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();

        final long MOD = 1_000_000_007;
        final long TWO_INVERSE = 500_000_004;
        long sum = 0;
        long res = 0;
        for (int i = 0; i < N; i++) {
            long a = readLong();
            sum += a;
            res -= a * a % MOD;
        }

        sum %= MOD;
        res = (res + sum * sum % MOD) % MOD * TWO_INVERSE % MOD;
        if (res < 0) res += MOD;
        System.out.println(res);
    }
}
