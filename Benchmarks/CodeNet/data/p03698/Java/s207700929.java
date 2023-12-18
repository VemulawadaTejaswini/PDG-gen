import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Echizen
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            char[] chars = str.toCharArray();
            HashSet<Object> set = new HashSet<>();
            for (int i = 0; i < chars.length; i++) {
                set.add(chars[i]);
            }
            if (set.size() == chars.length) {
                out.println("yes");
            } else {
                out.println("no");
            }
        }

    }
}

