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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int min = Integer.MAX_VALUE;
            int max = -1;

            for (int i = 0; i < n; i++) {
                int tmp = in.nextInt();
                max = Math.max(max, tmp);
                min = Math.min(min, tmp);
            }
            out.println(max - min);
        }

    }
}

