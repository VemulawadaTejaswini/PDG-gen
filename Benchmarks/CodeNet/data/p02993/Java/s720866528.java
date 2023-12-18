import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ASecurity solver = new ASecurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class ASecurity {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            String s = sc.nextLine();
            for (int i = 1; i < 4; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    out.println("Bad");
                    return;
                }
            }
            out.println("Good");
        }

    }

    static class inputClass {
        BufferedReader br;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

