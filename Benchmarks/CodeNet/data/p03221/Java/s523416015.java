import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

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
        ID solver = new ID();
        solver.solve(1, in, out);
        out.close();
    }

    static class ID {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] years = new long[m];
            HashMap<Long, Integer> map = new HashMap<>();
            int[] pre = new int[n + 1];
            HashMap<Integer, Long> imap = new HashMap<>();


            for (int i = 0; i < m; i++) {
                int p = in.nextInt();
                long year = in.nextLong();
                years[i] = year;
                map.put(year, p);
                imap.put(i, year);
            }

            Arrays.sort(years);

            HashMap<Long, String> result = new HashMap<>();
            for (int i = 0; i < m; i++) {
                long year = years[i];
                int p = map.get(year);
                int num = pre[p] + 1;
                pre[p] = num;

                result.put(year, String.format("%06d%06d", p, num));
            }

            for (Integer i : imap.keySet()) {
                Long y = imap.get(i);
                out.println(result.get(y));
            }
        }

    }
}

