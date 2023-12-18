import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static final void main(String[] args) {
        Main m = new Main();
        m.init();
        m.solve();
        out.flush();
    }

    // ========================================================================= //

    public void init() {

    }

    public void solve() {
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int sn = s.length;
        int tn = t.length;

        boolean check0 = false;
        for (int i = sn - tn; i >= 0; i--) {
            boolean check1 = true;
            for (int j = 0; j < tn; j++) {
                if (s[j + i] == '?') continue;
                if (s[j + i] == t[j]) continue;
                check1 = false;
                break;
            }
            if (check1) {
                for (int j = 0; j < tn; j++) {
                    s[j + i] = t[j];
                }
                check0 = true;
                break;
            }
        }

        if (!check0) {
            out.println("UNRESTORABLE");
            return;
        }

        for (int i = 0; i < sn; i++) {
            if (s[i] == '?') s[i] = 'a';
        }

        out.println(s);
    }
}
