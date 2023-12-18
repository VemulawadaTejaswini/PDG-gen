import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**

 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ALimitedInsertion solver = new ALimitedInsertion();
        solver.solve(1, in, out);
        out.close();
    }

    static class ALimitedInsertion {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int arr[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }
            int flag = 0;
            Arrays.sort(arr);
            for (int i = 1; i <= n; i++) {
                if (arr[i] > i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) out.println(-1);
            else {
                for (int i = 1; i <= n; i++)
                    out.println(arr[i]);
            }
        }

    }
}

