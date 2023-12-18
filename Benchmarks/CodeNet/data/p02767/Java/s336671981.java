import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
            List<Integer> array = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                array.add(in.nextInt());
            }
            Collections.sort(array);

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.get(array.size() - 1); i++) {
                double p = i + 1;
                int sum = 0;
                for (int x : array) {
                    sum += Math.pow(x - p, 2.0);
                }
                min = Math.min(min, sum);
            }
            out.println(min);
        }
    }
}