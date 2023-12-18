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
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        long X;
        long Y;
        long Z;
        long K;
        List<Long> A = new ArrayList<>();
        List<Long> B = new ArrayList<>();
        List<Long> C = new ArrayList<>();

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // input
            getInput(in);

            List<Long> resultTmp = new ArrayList<>();
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    for (int k = 0; k < Z; k++) {
                        resultTmp.add(A.get(i) + B.get(j) + C.get(k));
                    }
                }
            }

            List<Long> result = resultTmp.stream().sorted(new Comparator<Long>() {

                public int compare(Long o1, Long o2) {
                    int result = o2 > o1 ? 1 : -1;
                    return result;
                }
            }).collect(Collectors.toList());
            for (int i = 0; i < K; i++) {
                out.println(result.get(i));
            }
        }

        private void getInput(Scanner in) {
            X = in.nextLong();
            Y = in.nextLong();
            Z = in.nextLong();
            K = in.nextLong();

            for (int i = 0; i < X; i++) {
                A.add(in.nextLong());
            }
            for (int i = 0; i < X; i++) {
                B.add(in.nextLong());
            }
            for (int i = 0; i < X; i++) {
                C.add(in.nextLong());
            }
        }

    }
}

