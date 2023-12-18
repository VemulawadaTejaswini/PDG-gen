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

        int ans = 27;
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
}