import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        int a[] = new int[N];
        int b[] = new int[N];
        int c[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = nextInt(r);
            b[i] = nextInt(r);
            c[i] = nextInt(r);
        }

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        for (int i = 0; i < N; i++) {
            int tmpA = sumA;
            int tmpB = sumB;
            int tmpC = sumC;
            sumA = tmpB+a[i] > tmpC+a[i] ? tmpB+a[i] : tmpC+a[i];
            sumB = tmpA+b[i] > tmpC+b[i] ? tmpA+b[i] : tmpC+b[i];
            sumC = tmpA+c[i] > tmpB+c[i] ? tmpA+c[i] : tmpB+c[i];
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
