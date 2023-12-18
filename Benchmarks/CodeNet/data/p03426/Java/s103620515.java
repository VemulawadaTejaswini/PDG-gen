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
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPracticalSkillTest solver = new DPracticalSkillTest();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPracticalSkillTest {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int d = in.nextInt();
            HashMap<Integer, Pair> hm = new HashMap<>();
            int[] cumDist = new int[h * w + 1];
            for (int i = 0; i <= d; i++) {
                cumDist[i] = 0;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    Pair p = new Pair(i, j);
                    int val = in.nextInt();
                    hm.put(val, p);
                }
            }

            for (int i = d + 1; i <= h * w; i++) {
                Pair p1 = new Pair(hm.get(i).x, hm.get(i).y);
                Pair p2 = new Pair(hm.get(i - d).x, hm.get(i - d).y);
                cumDist[i] = cumDist[i - d] + Pair.dist(p1, p2);
            }
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int st = in.nextInt();
                int en = in.nextInt();
                out.println(cumDist[en] - cumDist[st]);
            }
        }

    }

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        static int dist(Pair p1, Pair p2) {
            return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
        }

    }
}

