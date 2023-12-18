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
        gacha solver = new gacha();
        solver.solve(1, in, out);
        out.close();
    }

    static class gacha {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(in.next());
            }
            out.append(String.valueOf(set.size()));
        }

    }
}

