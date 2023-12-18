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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            in.nextLine();
            String[] ss = new String[n];

            for (int i = 0; i < n; ++i) {
                ss[i] = in.nextLine();
            }

            int[] min_alphabet_count = new int[26];
            for (int i = 0; i < 26; ++i) {
                min_alphabet_count[i] = Integer.MAX_VALUE;
            }

            for (int i = 0; i < ss.length; ++i) {
                String str = ss[i];
                for (int j = 0; j < 26; ++j) {
                    int c = count(str, (char) ('a' + j));
                    if (c < min_alphabet_count[j]) {
                        min_alphabet_count[j] = c;
                    }
                }
            }

            for (int i = 0; i < min_alphabet_count.length; ++i) {
                int cnt = min_alphabet_count[i];
                String str = String.valueOf((char) ('a' + i));
                for (int j = 0; j < cnt; ++j) {
                    out.print(str);
                }
            }
            out.println();
        }

        //count the number of times a char occurs in string
        public int count(String str, char ch) {
            int cnt = 0;
            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) == ch) cnt++;
            }
            return cnt;
        }

    }
}

