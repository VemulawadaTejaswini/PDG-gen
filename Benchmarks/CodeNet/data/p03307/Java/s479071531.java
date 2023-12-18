import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long N = Long.parseLong(sc.next());
        sc.close();

        long ans;
        if (N % 2 == 0) {
            ans = N;
        } else {
            ans = N * 2;
        }
        out.printf("%d\n", ans);
        out.flush();
    }
}
