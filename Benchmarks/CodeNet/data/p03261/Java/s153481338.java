import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        ABC_109_B solver = new ABC_109_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_109_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<String> list = new ArrayList<String>();

            for (int i = 0; i < n; i++) {
                String str = in.next();
                if (list.contains(str)) {
                    out.print("No");
                    return;
                }
                list.add(str);
            }
            for (int i = 0; i < n - 1; i++) {
                String str1 = list.get(i);
                String str2 = list.get(i + 1);

                if (str1.charAt(str1.length() - 1) != str2.charAt(0)) {
                    out.print("No");
                    return;
                }
            }

            out.print("Yes");

        }

    }
}

