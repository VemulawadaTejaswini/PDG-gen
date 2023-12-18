import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int M = nextInt();

        boolean[] CF = new boolean[N+1]; // 正解フラグ
        int AC = 0;
        int WA = 0;
        for (int i = 0; i < M; i++) {
            int Pi = nextInt();
            if (CF[Pi] == true) {
                nextString();
                continue;
            }
            String Si = nextString();
            if (Si.equals("AC")) {
                AC++;
                CF[Pi] = true;
            }
            if (Si.equals("WA")) {
                WA++;
            }
        }

        System.out.println(AC + " " + WA);
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