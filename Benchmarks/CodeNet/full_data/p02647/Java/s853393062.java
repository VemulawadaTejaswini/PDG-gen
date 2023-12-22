import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int K = in.nextInt();
        int[] A = new int[N];
        for (int n = 0; n < N; n++)
            A[n] = in.nextInt();

        int[] B = new int[N];
        for (int n = 0; n < N; n++) {
            B[n]++;
            for (int d = 1; d <= A[n]; d++) {
                if (n - d >= 0)
                    B[n - d]++;
                if (n + d < N)
                    B[n + d]++;
            }
        }

        if (K >= 42) {
            out.print(N);
            for (int n = 1; n < N; n++)
                out.print(" " + N);
            out.println();
            out.flush();
            return;
        }

        for (int k = 1; k < K; k++) {
            int[] C = new int[N];
            for (int n = 0; n < N; n++) {
                for (int d = A[n] + 1; d <= B[n] && n - d >= 0; d++)
                    C[n - d]++;
                for (int d = A[n] + 1; d <= B[n] && n + d < N; d++)
                    C[n + d]++;
            }
            boolean b = true;
            for (int n = 0; n < N; n++) {
                A[n] = B[n];
                B[n] += C[n];
                b &= C[n] == 0;
            }
            if (b) break;
        }

        out.print(B[0]);
        for (int n = 1; n < N; n++)
            out.print(" " + B[n]);
        out.println();

        out.flush();
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}

