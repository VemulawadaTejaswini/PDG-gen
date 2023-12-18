import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

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
            int K = in.nextInt();
            int max = 0;
            double expectedValue = 0;
            Queue<Integer> queue = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                queue.add(in.nextInt());
                if (!queue.isEmpty() && i >= K) {
                    queue.poll();
                }
                int sum = queue.stream().mapToInt(Integer::intValue).sum();
                if (max < sum) {
                    max = sum;
                    expectedValue = queue.stream().mapToDouble(j -> {
                        double partialSum = 0;
                        for (int k = 1; k <= j; k++) {
                            partialSum += k;
                        }
                        return partialSum / j;
                    }).sum();
                }
            }
            out.println(String.format("%.9f", expectedValue));
        }
    }
}