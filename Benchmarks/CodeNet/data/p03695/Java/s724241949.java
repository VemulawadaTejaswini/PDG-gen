import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int a[] = new int[n];
            Set<Integer> cnt = new HashSet<>();
            int overred = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                if (a[i] <= 399) cnt.add(0);
                if (400 <= a[i] && a[i] <= 799) cnt.add(1);
                if (800 <= a[i] && a[i] <= 1199) cnt.add(2);
                if (1200 <= a[i] && a[i] <= 1599) cnt.add(3);
                if (1600 <= a[i] && a[i] <= 1999) cnt.add(4);
                if (2000 <= a[i] && a[i] <= 2399) cnt.add(5);
                if (2400 <= a[i] && a[i] <= 2799) cnt.add(6);
                if (2800 <= a[i] && a[i] <= 3199) cnt.add(7);
                if (3200 <= a[i]) overred++;
            }
            int ansmx = cnt.size() + overred;
            int ansmn = cnt.size();
            if (cnt.size() == 0) ansmn = 1;

            // 出力
            out.println(ansmn + " " + ansmx);

        }

    }
}

