import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        String P = "";
        for (int i = 0; i < N; i++) {
            P += nextString();
        }
        String Q = "";
        for (int i = 0; i < N; i++) {
            Q += nextString();
        }

        String T = "";
        for (int i = 0; i < N; i++) {
            T += i+1;
        }

        // for (int i = 1; i <= 8)

        System.out.println(T);
    }

    // public static String getOrder(int d, String S, int order) {
    //     if (d == 0) {
    //         return S;
    //     }
    //     for (int )
    // }

    public static String nextString() throws Exception {
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

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }
}
