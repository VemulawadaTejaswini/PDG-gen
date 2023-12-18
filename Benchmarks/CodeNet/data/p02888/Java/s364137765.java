import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
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
        Triangles solver = new Triangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class Triangles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            Collections.sort(list);

            long result = 0;
            for (int i = 0; i < n; i++) {
                int a = list.get(i);
                for (int j = i + 1; j < n; j++) {
                    int b = list.get(j);
                    int k = Collections.binarySearch(list, a + b, new LowerBoundComparator<>());
                    if (k < 0) {
                        k = -k - 1;
                    }
                    result += Math.max((k - j - 1), 0);
                }
            }
            out.println(result);
        }

        class LowerBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
            public int compare(T x, T y) {
                return (x.compareTo(y) >= 0) ? 1 : -1;
            }

        }

    }
}

