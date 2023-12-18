import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESequenceDecomposing solver = new ESequenceDecomposing();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESequenceDecomposing {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int arr[] = new int[n];
            boolean bool[] = new boolean[n];
            for (int i = 0; i < n; i++) arr[i] = in.nextInt();
            int pairs = 0;
            int count = 1;
            a:
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((arr[i] < arr[j])) {
                        //out.println(arr[i]+" "+arr[j]);
                        pairs++;
                        //bool[j]=true;
                    }
                    if ((pairs + 1) == n) break a;
                }
                count++;
            }
            out.println(count);
        }

    }
}

