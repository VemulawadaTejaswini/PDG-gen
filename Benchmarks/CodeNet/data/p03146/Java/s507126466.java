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
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BCollatzProblem solver = new BCollatzProblem();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCollatzProblem {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int s = in.nextInt();
            Set<Integer> set = new HashSet<>();
            int cnt = 1;
            int temp = s;
            do {
                set.add(temp);
                if (temp % 2 == 0) temp /= 2;
                else temp = temp * 3 + 1;
                cnt++;
            } while (!set.contains(temp));
            out.println(cnt);
        }

    }
}

