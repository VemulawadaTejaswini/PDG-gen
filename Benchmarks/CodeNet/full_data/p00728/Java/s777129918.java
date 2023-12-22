import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            while (true) {
                int n = in.nextInt();
                if (n == 0) break;

                int sum = 0;
                int min = 1000;
                int max = 0;

                for (int i = 0; i < n; i++) {
                    int point = in.nextInt();
                    max = Math.max(max, point);
                    min = Math.min(min, point);
                    sum += point;
                }
                out.println((sum - max - min) / (n - 2));
            }
        }
    }
}


