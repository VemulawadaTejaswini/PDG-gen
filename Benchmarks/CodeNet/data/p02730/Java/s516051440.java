import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BStringPalindrome solver = new BStringPalindrome();
        solver.solve(1, in, out);
        out.close();
    }

    static class BStringPalindrome {
        public boolean isPalindrome(String s) {
            if (s.length() <= 1)
                return true;
            return s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1));
        }

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            String s = sc.next();
            if (isPalindrome(s) && isPalindrome(s.substring(0, (s.length() - 1) / 2)) && isPalindrome(s.substring(((s.length() + 3) / 2) - 1)))
                pw.println("Yes");
            else
                pw.println("No");
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

    }
}

