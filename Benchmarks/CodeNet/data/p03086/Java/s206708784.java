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
        BATCoder solver = new BATCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class BATCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int curr = 0;
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                String ele = s.substring(i, i + 1);
                if (ele.compareTo("A") == 0 || ele.compareTo("C") == 0 || ele.compareTo("G") == 0 || ele.compareTo("T") == 0) {
                    curr++;
                    if (max < curr)
                        max = curr;
                } else
                    curr = 0;
            }
            out.println(max);
        }

    }
}

