import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
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
        ABC111_C solver = new ABC111_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC111_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Map<Integer, Integer> even = new HashMap<Integer, Integer>();
            Map<Integer, Integer> odd = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int tmp = in.nextInt();
                if (i % 2 == 0) {
                    if (even.containsKey(tmp)) {
                        even.put(tmp, even.get(tmp) + 1);
                    } else {
                        even.put(tmp, 1);
                    }
                } else {
                    if (odd.containsKey(tmp)) {
                        odd.put(tmp, odd.get(tmp) + 1);
                    } else {
                        odd.put(tmp, 1);
                    }
                }
            }

            int maxEven = 0;
            int maxEvenKey = -1;

            for (int key : even.keySet()) {
                if (maxEven < even.get(key)) {
                    maxEven = Math.max(maxEven, even.get(key));
                    maxEvenKey = key;
                }

            }


            int maxOdd = 0;
            int maxOddKey = -1;
            for (int key : odd.keySet()) {
                if (maxOdd < odd.get(key)) {
                    maxOdd = Math.max(maxOdd, odd.get(key));
                    maxOddKey = key;
                }
            }

            if (maxEvenKey == maxOddKey) {
                out.print(n - maxEven - maxOdd + n / 2);
            } else {

                out.print(n - maxEven - maxOdd);
            }


        }

    }
}

