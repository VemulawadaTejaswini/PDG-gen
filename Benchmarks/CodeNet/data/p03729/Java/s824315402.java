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

            String str1 = in.nextLine();
            String[] ar = str1.split(" ");
            String A = ar[0];
            String B = ar[1];
            String C = ar[2];

            if (A.charAt(A.length() - 1) == B.charAt(0) &&
                    B.charAt(B.length() - 1) == C.charAt(0)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }
}

