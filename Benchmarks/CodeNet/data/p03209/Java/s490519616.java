import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Main {
    static long[] B;
    static long[] P;

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        int N = Integer.parseInt(sl[0]);
        long X = Long.parseLong(sl[1]);

        B = new long[N];
        P = new long[N];

        B[0] = 1L;
        P[0] = 1L;

        for (int i = 1; i < N; i++) {
            B[i] = 2 * B[i - 1] + 3;
            P[i] = 2 * P[i - 1] + 1;
        }

        long ans = f(N, X);

        out.println(ans);

        out.flush();
    }

    // レベル N
    // 下から X
    // パティ 数
    static long f(int N, long X) {
        if (X <= 0) return 0L;
        if (N == 0) return 1L;
        if (X == 1) return 0L;
        if (1 < X && X <= B[N - 1] + 1) return f(N - 1, X - 1);
        return P[N - 1] + 1 + f(N - 1, X - 2 - B[N - 1]);
    }
}
