import java.io.*;
import java.util.*;

public class Main {
    int[][][] memo;

    int solve(int n, int bits, int sum) {
        if (n == 0) {
            if (sum == 0) return 1;
            return 0;
        }
        if (sum > 330) return 0;
        if (sum < 0) return 0;
        if (memo[n][bits][sum] != -1) return memo[n][bits][sum];
        int ans = 0;
        for (int i = 0; i < 10; ++i) {
            if (((bits >> i) & 1) != 0) {
                ans += solve(n - 1, bits & ~(1 << i), sum - i*(10 - Integer.bitCount(bits) + 1));
            }
        }
        return memo[n][bits][sum] = ans;
    }

    void run() {
        memo = new int[11][1024][331];
        for (int i = 0; i < 11; ++i) {
            for(int j = 0; j < 1024; ++j) {
                for (int k = 0; k < 331; ++k) {
                    memo[i][j][k] = -1;
                }
            }
        }
        try {
            while (true) {
                int N = readInt();
                int S = readInt();
                sysout.println(solve(N, (1 << 10) - 1, S));
            }
        } catch (NullPointerException e) {
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}