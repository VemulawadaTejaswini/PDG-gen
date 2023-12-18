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

            int[] ar = {1, 3, 5, 7, 8, 10, 12};
            int[] arr = {4, 6, 9, 11};
            int[] arrr = {2};

            int x = in.nextInt();
            int y = in.nextInt();

            boolean isX = false;
            boolean isY = false;

            for (int i = 0; i < ar.length; ++i) {
                if (x == ar[i]) {
                    isX = true;
                }

                if (y == ar[i]) {
                    isY = true;
                }
            }

            if (isX && isY) {
                out.println("Yes");
                return;
            }

            isX = false;
            isY = false;
            for (int i = 0; i < arr.length; ++i) {
                if (x == ar[i]) {
                    isX = true;
                }

                if (y == ar[i]) {
                    isY = true;
                }
            }

            if (isX && isY) {
                out.println("Yes");
                return;
            }

            out.println("No");

        }

    }
}

