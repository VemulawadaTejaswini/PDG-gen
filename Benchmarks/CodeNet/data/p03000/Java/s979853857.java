import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int X = in.nextInt();
            int[] L = new int[N];
            for (int i = 0; i < N; i++) {
                L[i] = in.nextInt();
            }

            int jumpNum = 1;
            int distance = 0;
            for (int i = 0; i < N; i++) {
                distance += L[i];
                if (distance <= X) {
                    jumpNum++;
                } else {
                    break;
                }
            }
            out.println(jumpNum);
        }

    }
}

