import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        long[] X = new long[N];
        long[] Y = new long[N];

        long max = 0;
        int type = 0; // 1:odd, 2:even
        for (int i = 0; i < N; i++) {
            long Xi = nextInt(r);
            long Yi = nextInt(r);
            X[i] = Xi;
            Y[i] = Yi;

            long abs = Math.abs(Xi) + Math.abs(Yi);
            max = abs > max ? abs : max;

            if (type == 0) {
                type = abs%2 == 1 ? 1 : 2;
            }
            if (type == 1 && abs%2 == 0 || type == 2 && abs%2 == 1) {
                type = 0;
                break;
            }
        }

        if (type == 0) {
            System.out.println(-1);
        } else {
            int[] exp = new int[1];
            setExp(exp, max);

            int m = exp[0] + type;
            System.out.println(m);

            long[] d = new long[m];
            for (int i = 0; i < m; i++) {
                if (i < exp[0]) {
                    long pow = pow(2, exp[0]-i);
                    d[i] = pow;
                } else {
                    d[i] = 1;
                }
            }

            String dm = "";
            for (int i = 0; i < exp[0]; i++) {
                dm += d[i]+" ";
            }
            dm += type == 1 ? "1" : "1 1";
            System.out.println(dm);

            for (int i = 0; i < N; i++) {
                long x = 0;
                long y = 0;
                String w = "";
                for (int j = 0; j < m; j++) {
                    long dx = X[i] - x;
                    long dy = Y[i] - y;
                    if (Math.abs(dx) > Math.abs(dy)) {
                        x += dx > 0 ? d[j] : -d[j];
                        w += dx > 0 ? "R" : "L";
                    } else {
                        y += dy > 0 ? d[j] : -d[j];
                        w += dy > 0 ? "U" : "D";
                    }
                }
                System.out.println(w);
            }
        }
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

    public static void setExp(int[] exp, long max) {
        max = max/2;
        exp[0]++;
        if (max != 1) {
            setExp(exp, max);
        }
    }

    public static long pow(int r, int i) {
        if (i == 0) {
            return 1;
        } else {
            return r * pow(r, i-1);
        }
    }
}
