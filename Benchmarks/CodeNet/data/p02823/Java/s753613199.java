import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        long N = nextLong(r);
        long A = nextLong(r);
        long B = nextLong(r);

        long AB = A > B ? A - B : B - A;
        long ans = 0;
        if (AB % 2 == 0) {
            ans = AB / 2;
        } else {
            long NA = N > A ? N - A : A - N;
            long A1 = A - 1;
            long NB = N > B ? N - B : B - N;
            long B1 = B - 1;

            long DA = NA > A1 ? A1 : NA;
            long DB = NB > B1 ? B1 : NB;
            if (DA > DB) {
                ans = DB + (AB+1)/2;
            } else {
                ans = DA + (AB+1)/2;
            }
        }

        System.out.println(ans);
    }

    public static long nextLong(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Long.parseLong(str);
    }
}
