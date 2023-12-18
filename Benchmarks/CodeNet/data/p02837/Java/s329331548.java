import java.util.*;
import java.io.*;
public class Main {
    static int[][] A;
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        A = new int[N][N];
        for (int i = 0; i < N; i++) {
            int Ai = nextInt(r);
            for (int j = 0; j < Ai; j++) {
                int x = nextInt(r);
                int y = nextInt(r);
                A[i][x-1] = y == 1 ? 1 : -1;
            }
        }

        int ans = 0;
        int pow = pow(N);
        for (int i = 0; i < pow; i++) {
            int[] d = set(N, i);
            boolean[] f = new boolean[2]; // [0]:ok, [1]:update
            do {
                f = check(N, d);
            } while (f[0] && f[1]);
            if (f[0]) {
                int c = 0;
                for (int j = 0; j < N; j++) {
                    if (d[j] == 1) {
                        c++;
                    }
                }
                ans = Math.max(ans, c);
            }
        }
        System.out.println(ans);
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Integer.parseInt(str);
    }

    public static int pow(int N) {
        return N == 0 ? 1 : 2 * pow(N-1);
    }

    public static int[] set(int N, int i) {
        int[] res = new int[N];
        for (int j = 0; j < N; j++) {
            res[j] = i % 2 == 1 ? 1 : 0;
            i = i / 2;
        }
        return res;
    }

    public static boolean[] check(int N, int[] d) {
        boolean[] res = new boolean[2];
        res[0] = true;
        for (int j = 0; j < N; j++) {
            if (d[j] == 1) {
                for (int k = 0; k < N; k++) {
                    if (A[j][k] == 1) {
                        if (d[k] == -1) {
                            res[0] = false;
                            return res;
                        }
                        if (d[k] == 0) {
                            d[k] = A[j][k];
                            res[1] = true;
                        }
                    }
                    if (A[j][k] == -1) {
                        if (d[k] == 1) {
                            res[0] = false;
                            return res;
                        }
                        if (d[k] == 0) {
                            d[k] = A[j][k];
                            res[1] = true;
                        }
                    }
                }
            }
        }
        return res;
    }
}
