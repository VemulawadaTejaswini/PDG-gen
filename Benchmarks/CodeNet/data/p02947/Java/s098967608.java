import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGreenBin solver = new CGreenBin();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGreenBin {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String a[] = new String[n];
            String clear = in.nextLine();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLine();
            }
            long count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (anagram(a[i], a[j]))
                        count++;
                }
            }
            out.print(count);
        }

        boolean anagram(String a, String b) {
            int c[] = new int[26];
            for (int i = 0; i < 10; i++) {
                c[a.charAt(i) - 'a']++;
                c[b.charAt(i) - 'a']--;
            }
            boolean ans = Arrays.stream(c).distinct().count() == 1;
            return ans;
        }

    }
}

