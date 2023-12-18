import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long res = 0;
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                String s = in.next();
                char[] ca = s.toCharArray();
                Arrays.sort(ca);
                String _s = new String(ca);
                if (hm.containsKey(_s)) {
                    hm.replace(_s, hm.get(_s) + 1);
                    res += hm.get(_s);
                } else {
                    hm.put(_s, 0);
                }
            }
            out.println(res);
        }

    }
}

