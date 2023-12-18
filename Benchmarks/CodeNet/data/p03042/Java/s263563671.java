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
        BYYMMOrMMYY solver = new BYYMMOrMMYY();
        solver.solve(1, in, out);
        out.close();
    }

    static class BYYMMOrMMYY {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            String s = sc.nextLine();
            int first = Integer.parseInt(s.substring(0, 2));
            int second = Integer.parseInt(s.substring(2));
            if (first > 0 && first <= 12) {
                if (second > 12 || second == 0) {
                    out.println("MMYY");
                } else {
                    out.println("AMBIGUOUS");
                }
            } else if (second > 0 && second <= 12) {
                if (first > 12 || first == 0) {
                    out.println("YYMM");
                } else {
                    out.println("AMBIGUOUS");
                }
            } else {
                out.println("NA");
            }
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

