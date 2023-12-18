import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DBannedK solver = new DBannedK();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBannedK {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];
            Stream.iterate(1, x -> x + 1)
                    .limit(n)
                    .forEach(i -> a[i - 1] = in.nextInt());

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int x : a) {
                map.putIfAbsent(x, 0);
                map.put(x, map.get(x) + 1);
            }

            for (int i = 0; i < n; i++) {
                int result = 0;
                int k = a[i];
                map.put(k, map.get(k) - 1);
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    int b = entry.getValue();
                    result += (b * (b - 1)) / 2;
                }
                out.println(result);
                map.put(k, map.get(k) + 1);
            }


        }

    }
}

