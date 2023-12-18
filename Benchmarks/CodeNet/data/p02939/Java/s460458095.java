import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        String s = in.next();

        char[] ch = s.toCharArray();

        int ans = 0, i = 0;
        String before = "";
        String current = "";
        while (i < s.length()) {
            current += ch[i];
            if (!current.equals(before)) {
                ans++;
                before = current;
                current = "";
            }
            i++;
        }
        out.println(ans);
    }

}
