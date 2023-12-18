import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            String alpha = "abcdefghijklmnopqrstuvwxyz";
            String str = in.nextLine();

            char temp = ' ';
            for (int i = 0; i < alpha.length(); ++i) {
                char c = alpha.charAt(i);
                if (!str.contains("" + c)) {
                    temp = c;
                    break;
                }
            }

            if (temp == ' ') {
                out.println("None");
            } else {
                out.println(temp);
            }
        }

    }
}

