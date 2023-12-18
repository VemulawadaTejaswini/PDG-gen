import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

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
            ArrayList<Integer> a = new ArrayList<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                a.add(in.nextInt());
            }
            a.sort(Comparator.naturalOrder());
            while (a.size() > 1) {
                int size = a.size() - 1;
                int use = a.get(size);
                // 二分探索で一つ上のを探す
                // 一回当たりlogNだから全体で N*logN が上界
                int target = 1;
                while (target <= use) {
                    target *= 2;
                }
                target -= use;
                a.remove(size);
                // targetを二分探索で探す
                int low = 0;
                int high = size - 1;
                int mid = (low + high) / 2;
                while (high >= low) {
                    int search = a.get(mid);
                    if (search < target) {
                        low = mid + 1;
                    } else if (search > target) {
                        high = mid - 1;
                    } else {
                        ans++;
                        a.remove(mid);
                        break;
                    }
                    mid = (low + high) / 2;
                }
            }
            out.println(ans);
        }

    }
}

