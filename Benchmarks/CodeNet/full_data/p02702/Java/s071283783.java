import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        MultipleOf2019 solver = new MultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class MultipleOf2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int limit = s.length();

            long result = 0;
            for (int i = 0; i <= limit - 3; i++) {
                for (int j = i + 4; j <= limit; j++) {
                    String str = s.substring(i, j);
                    if (isMultiple(str, 10, 2019)) {
                        result++;
                    }
                }
            }
            out.append(String.valueOf(result));
        }

        static boolean isMultiple(String s, int base, int m) {
            int temp = 0;
            for (int i = 0; i < s.length(); i++) {
                temp = (temp * base + Character.getNumericValue(s.charAt(i))) % m;
            }
            return temp == 0;
        }

    }
}

