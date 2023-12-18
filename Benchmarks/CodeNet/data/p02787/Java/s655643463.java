import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int H = in.nextInt();
            int N = in.nextInt();
            spell[] spells = new spell[N];
            for (int i = 0; i < N; i++) {
                spells[i] = new spell();
                spells[i].dmg = in.nextInt();
                spells[i].cost = in.nextInt();
            }
            Arrays.sort(spells, (spell f, spell s) -> (f.dmg * s.cost - s.dmg * f.cost) / (s.cost * f.cost));
            int l = 0, r = spells[0].cost * (H / spells[0].dmg + 1);
            while (r - l > 1) {
                int mid = (r + l) / 2;
                if (maxDmg(spells, mid) >= H) {
                    r = mid;
                } else {
                    l = mid;
                }
            }
            out.println(r);
        }

        int maxDmg(spell[] spells, int cost) {
            int maxDmg = 0;
            for (int i = 0; i < spells.length; i++) {
                int hit = cost / spells[i].cost;
                maxDmg += spells[i].dmg * hit;
                cost -= spells[i].cost * hit;
            }
            return maxDmg;
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer stt;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        public String next() {
            while (stt == null || !stt.hasMoreTokens()) {
                stt = new StringTokenizer(nextLine());
            }
            return stt.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class spell {
        int dmg;
        int cost;

    }
}

