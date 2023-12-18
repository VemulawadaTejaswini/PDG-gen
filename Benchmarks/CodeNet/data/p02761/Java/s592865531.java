import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            Map<Integer, Integer> map = new HashMap<>();

            boolean ng = false;
            for (int i = 0; i < M; i++) {
                int s = in.nextInt();
                int c = in.nextInt();

                if (map.get(s) == null) {
                    map.put(s, c);
                }
                else if (map.get(s) != c) {
                    ng = true;
                }

                if (N > 1 && s == 1 && c == 0) {
                    ng = true;
                }
            }

            if (ng) {
                out.println(-1);
                return;
            }

            String[] ans = new String[N];
            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                int s = entry.getKey();
                int c = entry.getValue();
                ans[s - 1] = String.valueOf(c);
            }
            for (int i = 0; i < N; i++) {
                if (ans[i] == null) {
                    if (i == 0) {
                        if (M == 0) {
                            ans[i] = "0";
                        }
                        else {
                            ans[i] = "1";
                        }
                    }
                    else {
                        ans[i] = "0";
                    }
                }
            }
            out.println(String.join("", ans));
        }
    }
}