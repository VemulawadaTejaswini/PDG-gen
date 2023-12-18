import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.Comparator;
import java.util.stream.Collectors;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int Z = in.nextInt();
            int K = in.nextInt();

            long[] A = new long[X];
            long[] B = new long[Y];
            long[] C = new long[Z];
            for (int i = 0; i < X; i++) {
                A[i] = in.nextLong();
            }
            for (int i = 0; i < Y; i++) {
                B[i] = in.nextLong();
            }
            for (int i = 0; i < Z; i++) {
                C[i] = in.nextLong();
            }

            List<Long> list = new ArrayList<>();
            for (int i = 0; i < X; i++) {
                list.add(A[i]);
            }
            list.sort(Comparator.reverseOrder());
            List<Long> list2 = list.stream().limit(K).collect(Collectors.toList());

            list.clear();
            for (int i = 0; i < list2.size(); i++) {
                for (int j = 0; j < Y; j++) {
                    list.add(list2.get(i) + B[j]);
                }
            }
            list.sort(Comparator.reverseOrder());
            list2 = list.stream().limit(K).collect(Collectors.toList());

            list.clear();
            for (int i = 0; i < list2.size(); i++) {
                for (int j = 0; j < Z; j++) {
                    list.add(list2.get(i) + C[j]);
                }
            }

            list.sort(Comparator.reverseOrder());
            list.stream().limit(K).forEach(out::println);
        }

    }
}

