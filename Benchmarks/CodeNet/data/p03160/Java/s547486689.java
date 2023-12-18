import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int[] h = new int[N+5];
        for (int i = 1; i <= N; i++) {
            h[i] = nextInt();
        }

        int[] DP = new int[N+5];
        Arrays.fill(DP, Integer.MAX_VALUE);
        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                DP[i+1] = Math.abs(h[i+1] - h[i]);
                DP[i+2] = Math.abs(h[i+2] - h[i]);
                continue;
            }
            DP[i+1] = Math.min(DP[i+1], DP[i] + Math.abs(h[i+1] - h[i]));
            DP[i+2] = Math.min(DP[i+2], DP[i] + Math.abs(h[i+2] - h[i]));
        }

        System.out.println(DP[N]);
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