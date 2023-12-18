import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.nextLine();
            int n = s.length();
            boolean result = isPalindrome(s) && isPalindrome(s.substring(0, (n - 1) / 2)) && isPalindrome(s.substring((n + 2) / 2));
            out.println(result ? "Yes" : "No");
        }

        boolean isPalindrome(String s) {
            StringBuilder a = new StringBuilder(s);
            a = a.reverse();
            return a.toString().compareTo(s) == 0;
        }

    }
}

