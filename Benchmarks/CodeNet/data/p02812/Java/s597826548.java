import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();

        int ans = 0;
        int cnt = 0;
        while (true) {
            int c = r.read();
            if (c == -1) {
                break;
            }

            if (cnt == 0 && 'A' == (char)c) {
                cnt++;
                continue;
            }
            else if (cnt == 1 && 'B' == (char)c) {
                cnt++;
                continue;
            }
            else if (cnt == 2 && 'C' == (char)c) {
                ans++;
                cnt = 0;
                continue;
            }
            else {
                cnt = 0;
            }
        }
        System.out.println(ans);
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
