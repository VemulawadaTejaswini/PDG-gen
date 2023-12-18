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
        ATenki solver = new ATenki();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATenki {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int ans = 0;
            for (int i = 0; i < 3; i++) {
                if (a.charAt(i) == b.charAt(i)) {
                    ans++;
                }
            }
            out.println(ans);
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

