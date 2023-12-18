import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        int[][] XY = new int[N][2];
        for (int i = 0; i < N; i++) {
            XY[i][0] = nextInt(r);
            XY[i][1] = nextInt(r);
        }
        System.out.println("3");
        System.out.println("1 1 1");
        System.out.println("LLR");
        System.out.println("UUU");
        System.out.println("DRR");
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
}
