import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    String INPUT = "";

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    void run() {
        Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
        PrintWriter out = new PrintWriter(System.out);

        solve(sc, out);
        out.flush();
    }

    void solve(Scanner sc, PrintWriter out) {
        String S = sc.next();
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                ans += S.substring(i, i+1).toUpperCase();
            } else {
                ans += S.substring(i, i+1).toLowerCase();
            }
        }
        System.out.println(ans);
    }
}

