import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] march = new long[5];

            for (int i = 0; i < n; i++) {
                String s = in.next();
                if (s.charAt(0) == 'M') march[0]++;
                if (s.charAt(0) == 'A') march[1]++;
                if (s.charAt(0) == 'R') march[2]++;
                if (s.charAt(0) == 'C') march[3]++;
                if (s.charAt(0) == 'H') march[4]++;
            }

            ArrayList<Long> count = new ArrayList<>();
            for (long i : march) {
                if (i != 0) {
                    count.add(i);
                }
            }

            long ans = 0;
            if (count.size() >= 3) {
                for (int i = 0; i < count.size(); i++) {
                    for (int j = i + 1; j < count.size(); j++) {
                        for (int k = j + 1; k < count.size(); k++) {
                            ans += count.get(i) * count.get(j) * count.get(k);
                        }
                    }
                }
            }


            out.print(ans);
        }

    }
}

