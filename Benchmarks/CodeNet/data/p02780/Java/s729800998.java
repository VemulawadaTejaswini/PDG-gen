import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

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
            int maxIndex = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(in.nextInt());
            }

            Queue<Integer> queue = new ArrayDeque<>();
            int maxSum = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int p = list.get(i);
                queue.add(p);
                sum += p;
                if (!queue.isEmpty() && i >= K) {
                    sum -= queue.poll();
                }
                if (maxSum < sum) {
                    maxSum = sum;
                    maxIndex = i;
                }
            }

            List<Integer> expectedList = new ArrayList<>();
            int maxItem = 0;
            for (int i = 0; i < K; i++) {
                int index = maxIndex - i;
                int j = list.get(index);
                expectedList.add(j);
                if (maxItem < j) {
                    maxItem = j;
                }
            }

            double[] expectedArray = new double[maxItem];
            double[] sumArray = new double[maxItem];
            for (int i = 0; i < maxItem; i++) {
                if (i == 0) {
                    expectedArray[i] = 1;
                    sumArray[i] = 1;
                }
                else {
                    expectedArray[i] = (sumArray[i - 1] + i + 1) / (i + 1);
                    sumArray[i] = sumArray[i - 1] + i + 1;
                }
            }

            double expectedValue = 0;
            for (int i : expectedList) {
                expectedValue += expectedArray[i - 1];
            }

            out.println(String.format("%.9f", expectedValue));
        }
    }
}