import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            List<List<Integer>> A = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                A.add(new ArrayList<>());
                for (int j = 1; j < N; j++) {
                    A.get(i).add(in.nextInt());
                }
            }

            int ans = 0;
            boolean flag = true;
            boolean[] touch = new boolean[N];
            while (flag) {
                Arrays.fill(touch, false);
                ans++;
                flag = false;
                for (int i = 0; i < N; i++) {
                    if (touch[i]) {
                        continue;
                    }
                    List<Integer> current = A.get(i);
                    if (!current.isEmpty()) {
                        int t = current.get(0) - 1;
                        if (t <= i) {
                            continue;
                        }
                        List<Integer> target = A.get(t);
                        if (target.isEmpty()) {
                            continue;
                        }
                        int c = target.get(0) - 1;
                        if (c == i) {
                            flag = true;
                            touch[t] = true;
                            touch[c] = true;
                            current.remove(0);
                            target.remove(0);
                        }
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                if (!A.get(i).isEmpty()) {
                    out.println(-1);
                    return;
                }
            }
            out.println(ans);
        }

    }
}

