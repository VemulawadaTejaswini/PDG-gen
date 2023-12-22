import java.io.*;
import java.util.*;

public class Main {
    void run() {
        int N = readInt();
        int M = readInt();
        int L = readInt();
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = readInt();
            }
        }
        int[][] B = new int[M][L];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < L; j++) {
                B[i][j] = readInt();
            }
        }
        long[][] C = new long[N][L];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < L; j++) {
                for (int k = 0; k < M; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < L; j++) {
                if (j > 0) sysout.print(' ');
                sysout.print(C[i][j]);
            }
            sysout.println();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = null;

    String readLine() {
        buffer = null;
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String read() {
        if (buffer == null || !buffer.hasMoreTokens()) {
            buffer = new StringTokenizer(readLine());
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
}