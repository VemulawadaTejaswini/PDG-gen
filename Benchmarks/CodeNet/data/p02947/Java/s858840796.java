import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String[] s = new String[N];
            for (int i = 0; i < N; i++) {
                s[i] = in.next();
            }
            int counter = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (isAnagram(s[i], s[j])) {
                        counter++;
                    }
                }
            }
            out.println(counter);
        }

        static boolean isAnagram(String s1, String s2) {
            boolean result = false;
            StringBuilder sb2 = new StringBuilder(s2);
            for (int i = 0; i < s1.length(); i++) {
                String target = String.valueOf(s1.charAt(i));
                for (int j = 0; j < sb2.length(); j++) {
                    if (sb2.indexOf(target) != -1) {
                        sb2.deleteCharAt(sb2.indexOf(target));
                        break;
                    }
                }
            }
            if (sb2.length() == 0) {
                return true;
            }

            return result;
        }

    }
}

