import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        int K = nextInt(r);
        int R = nextInt(r);
        int S = nextInt(r);
        int P = nextInt(r);
        // System.out.println(N+" "+K+" "+R+" "+S+" "+P);
        int d = N / K + 1;
        int[][] T = new int[3][K];

        int ans = 0;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < K; j++) {
                int c = r.read();
                if (c == -1 || c == 10) {
                    break;
                }
                if (i%2 == 0) {
                    T[0][j] = c;
                } else {
                    T[1][j] = c;
                }
                if (c == 114) {
                    ans += getPoint(i, j, P, T);
                } else if (c == 115) {
                    ans += getPoint(i, j, R, T);
                } else {
                    ans += getPoint(i, j, S, T);
                }
            }
        }
        System.out.println(ans);
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10) {
                break;
            }
            str += (char)c;
        }
        return Integer.parseInt(str);
    }

    public static int getPoint(int i, int j, int p, int[][] T) {
        int point = 0;
        if (T[0][j] == T[1][j] && T[2][j] == 0) {
            T[2][j] = 1;
        } else {
            point = p;
            T[2][j] = 0;
        }
        return point;
    }
}