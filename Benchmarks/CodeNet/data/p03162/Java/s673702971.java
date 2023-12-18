import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        for (int i = 0; i < N; i++) {
            int tmpA = sumA;
            int tmpB = sumB;
            int tmpC = sumC;
            int Ai = nextInt(r);
            int Bi = nextInt(r);
            int Ci = nextInt(r);
            sumA = tmpB+Ai > tmpC+Ai ? tmpB+Ai : tmpC+Ai;
            sumB = tmpA+Bi > tmpC+Bi ? tmpA+Bi : tmpC+Bi;
            sumC = tmpA+Ci > tmpB+Ci ? tmpA+Ci : tmpB+Ci;
        }

        int ans = Math.max(sumA, Math.max(sumB, sumC));
        System.out.println(ans);
    }

    public static String nextString(InputStreamReader r) throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        return Integer.parseInt(nextString(r));
    }

    public static long nextLong(InputStreamReader r) throws Exception {
        return Long.parseLong(nextString(r));
    }
}
