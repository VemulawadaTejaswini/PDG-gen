import java.util.*;
import java.io.*;

class Main {
    static PrintWriter out;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        call(n);
        out.flush();
    }
    public static void call(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                out.printf(" %d", i);
            } else {
                for (int j = i; j > 0; j /= 10) {
                    if (j % 10 == 3) {
                        out.printf(" %d", i);
                        break;
                    }
                }
            }
        }
        out.printf("\n");
    }
}
