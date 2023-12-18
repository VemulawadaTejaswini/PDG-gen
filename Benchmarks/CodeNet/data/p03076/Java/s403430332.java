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
            // input data
            int[] input = new int[5];
            for (int i = 0; i < 5; i++) {
                input[i] = in.nextInt();
            }
            // extract the number that first place is the least
            int firstPlaceMin = 9;
            int target = input[0];
            for (int i = 0; i < 5; i++) {
                int firstPlace = input[i] % 10;
                if (firstPlace != 0 && firstPlace < firstPlaceMin) {
                    firstPlaceMin = firstPlace;
                    target = input[i];
                }
            }

            // calculate the summation of round up number except the target
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += ((input[i] - 1) / 10) * 10 + 10;
            }
            sum = sum - (((target - 1) / 10) * 10 + 10) + target;

            out.println(sum);
        }

    }
}

