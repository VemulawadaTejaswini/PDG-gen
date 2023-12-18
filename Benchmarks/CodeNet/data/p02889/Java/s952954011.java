import java.io.*;
import java.util.*;

public class Main {

    static FastScanner sc = new FastScanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        final long INF = 1L << 60;
        long[][] G = new long[N][N];
        int[][] D = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(G[i], INF);
            Arrays.fill(D[i], 9999);
            G[i][i] = 0;
            D[i][i] = 0;
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;
            int C = sc.nextInt();
            G[A][B] = G[B][A] = C;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    G[j][k] = Math.min(G[j][k], G[j][i] + G[i][k]);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (G[i][j] <= L) {
                    D[i][j] = D[j][i] = 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    D[j][k] = Math.min(D[j][k], D[j][i] + D[i][k]);
                }
            }
        }
        int Q = sc.nextInt();
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            int S = sc.nextInt() - 1;
            int T = sc.nextInt() - 1;
            writer.println(D[S][T] > 999 ? -1 : D[S][T] - 1);
        }
        writer.flush();
    }

    static class FastScanner {
        Reader input;

        FastScanner() {
            this(System.in);
        }

        FastScanner(InputStream stream) {
            this.input = new BufferedReader(new InputStreamReader(stream));
        }

        int nextInt() {
            return (int) nextLong();
        }

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }

        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }

        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

    }

}
