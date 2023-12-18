import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        CGeTAC solver = new CGeTAC();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGeTAC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            String s = in.next();
            for (int i = 0; i < q; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                String str = s.substring(l - 1, r);
                int index = str.indexOf("AC");
                int count = 0;
                while (index != -1) {
                    count++;
                    index = str.indexOf("AC", index + 1);
                }
                out.println(count);
            }
        }

    }
}

