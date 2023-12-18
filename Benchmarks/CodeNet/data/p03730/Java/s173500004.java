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

            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();

            int sum = 0;
            int z = B % C;

            String str = "NO";

            for (int i = 0; i < 100; ++i) {
                sum = A * i;
                if (sum % 2 == 0) {
                    if (z % 2 != 0) {
                        str = "YES";
                    }
                }
            }
            out.println(str);

        }

    }
}

