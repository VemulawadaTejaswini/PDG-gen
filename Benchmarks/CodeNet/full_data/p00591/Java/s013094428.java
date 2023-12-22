import java.io.*;
import java.util.*;

public class Main {
    void run() {
        while (true) {
            int N = readInt();
            if (N == 0) break;
            int[][] M = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = readInt();
                }
            }
            boolean[][] target = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                int minVal = Integer.MAX_VALUE;
                for (int j = 0; j < N; j++) {
                    minVal = Math.min(minVal, M[i][j]);
                }
                for (int j = 0; j < N; j++) {
                    if (M[i][j] == minVal) target[i][j] = true;
                }
            }
            ArrayList<Integer> ans = new ArrayList<Integer>();
            for (int i = 0; i < N; i++) {
                int maxVal = Integer.MIN_VALUE;
                for (int j = 0; j < N; j++) {
                    maxVal = Math.max(maxVal, M[j][i]);
                }
                for (int j = 0; j < N; j++) {
                    if (M[j][i] == maxVal && target[j][i]) {
                        ans.add(M[j][i]);
                    }
                }
            }
            if (ans.isEmpty()) sysout.println(0);
            else {
                sysout.println(Collections.min(ans));
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = null;

    String read() {
        if (buffer == null || !buffer.hasMoreTokens()) {
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
        buffer = null;
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}