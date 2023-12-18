import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BCutAndCount solver = new BCutAndCount();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCutAndCount {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                String a = s.substring(0, i);
                String b = s.substring(i, s.length());
                int count = 0;
                boolean[] used = new boolean[26];
                outer:
                for (char c : a.toCharArray()) {
                    if (used[c - 97]) {
                        continue outer;
                    }
                    for (char d : b.toCharArray()) {
                        if (c == d) {
                            count++;
                            used[c - 97] = true;
                            continue outer;
                        }
                    }
                }
                if (count > max) {
                    max = count;
                }
            }
            System.out.println(max);
        }

    }
}

