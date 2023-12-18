import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Comparator;

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
        BPowersOfTwo solver = new BPowersOfTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPowersOfTwo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // input
            int n = in.nextInt();
            TreeMap<Integer, Integer> mp = new TreeMap<>(Comparator.naturalOrder());
            for (int i = 0; i < n; i++) {
                mp.merge(in.nextInt(), 1, Integer::sum);
            }
            int ans = 0;
            while (!mp.isEmpty()) {
                int use = mp.lastKey();
                mp.merge(use, -1, Integer::sum);
                if (mp.get(use) == 0) {
                    mp.remove(use);
                }
                int target = 1;
                while (target <= use) {
                    target *= 2;
                }
                target -= use;
                if (mp.containsKey(target)) {
                    mp.merge(target, -1, Integer::sum);
                    if (mp.get(target) == 0) {
                        mp.remove(target);
                    }
                    ans++;
                }


            }
            out.println(ans);
        }

    }
}

