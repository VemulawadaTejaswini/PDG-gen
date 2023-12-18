import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int M = nextInt();

        long LCM = 1;
        for (int i = 0; i < N; i++) {
            long AiD2 = nextInt()/2;
            LCM = AiD2 > LCM ? LCM/GCD(AiD2, LCM)*AiD2 : LCM/GCD(LCM, AiD2)*AiD2;
        }

        long ans = (M/LCM+1)/2;
        System.out.println(ans);
    }

    public static long GCD(long l, long s) {
        return l%s == 0 ? s : GCD(s, l%s);
    }

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
