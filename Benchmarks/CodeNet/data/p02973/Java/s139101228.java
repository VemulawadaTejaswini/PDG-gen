import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        SequenceDecomposing solver = new SequenceDecomposing();
        solver.solve(1, in, out);
        out.close();
    }

    static class SequenceDecomposing {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(in.next());
            }

            List<Long> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long aa = a[i];
//            int pos = Collections.binarySearch(list, aa, new LowerBoundComparator<>());
                int pos = arraySearch(list, aa);
                if (pos < 0) {
                    pos = ~pos;
                }
                if (pos == 0) {
                    list.add(0, aa);
                } else {
                    list.set(pos - 1, aa);
                }
            }
            out.println(list.size());

        }

        public int arraySearch(List<Long> list, long target) {
            int left = -1;
            int right = list.size();
            while (left + 1 < right) {
                int mid = (left + right) / 2;
                if (list.get(mid) < target) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            return left + 1;
        }

    }
}

