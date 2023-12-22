import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EThisMessageWillSelfDestructIn5s solver = new EThisMessageWillSelfDestructIn5s();
        solver.solve(1, in, out);
        out.close();
    }

    static class EThisMessageWillSelfDestructIn5s {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] height = new int[n];
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                height[i] = in.nextInt();
                hm.merge(i - height[i], 1, Integer::sum);
            }
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += hm.getOrDefault(height[i] + i, 0);
            }
            out.println(cnt);


        }

    }
}

