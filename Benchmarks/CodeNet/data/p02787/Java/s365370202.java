import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.TreeMap;
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
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                B[i] = in.nextInt();
            }
            TreeMap<Integer, Integer> dmgCost = new TreeMap<>();
            dmgCost.put(0, 0);
            int ans = Integer.MAX_VALUE;
            while (!dmgCost.isEmpty()) {
                TreeMap<Integer, Integer> dmgCostNext = new TreeMap<>();
                for (int curDmg : dmgCost.keySet()) {
                    for (int i = 0; i < N; i++) {
                        if (curDmg + A[i] >= H) {
                            ans = Math.min(ans, dmgCost.get(curDmg) + B[i]);
                        } else {
                            int nextCost = dmgCost.get(curDmg) + B[i];
                            if (dmgCostNext.containsKey(curDmg + A[i])) {
                                nextCost = Math.min(nextCost, dmgCostNext.get(curDmg + A[i]));
                            }
                            dmgCostNext.put(curDmg + A[i], nextCost);
                        }
                    }
                }
                dmgCost = dmgCostNext;
            }
            out.println(ans);
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
}

