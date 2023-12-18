import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

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
        BReversi solver = new BReversi();
        solver.solve(1, in, out);
        out.close();
    }

    static class BReversi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s = "";
            for (int i = 0; i < n; i++) {
                int val = in.nextInt();
                s += Integer.toString(val);
            }
            //out.println(s);
            HashMap<String, Boolean> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String ele = s.substring(i, i + 1);
                int index = s.indexOf(ele, i + 1);
                while (index != -1) {
                    if (index != i + 1) {
                        String str = s.substring(0, i + 1);
                        for (int k = i + 1; k < index; k++) str += s.substring(i, i + 1);
                        str += s.substring(index, s.length());
                        map.put(str, true);
                    }
                    index = s.indexOf(ele, index + 1);
                }
            }
            out.println(map.size() + 1);
        }

    }
}

