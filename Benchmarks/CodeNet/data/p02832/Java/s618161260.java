import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        int c = 0;
        int d = 1;
        for (int i = 1; i <= N; i++) {
            int tmp = nextInt(r);
            if (tmp == d) {
                d++;
            } else {
                c++;
            }
        }
        if (c == N) c = -1;
        System.out.println(c);
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
