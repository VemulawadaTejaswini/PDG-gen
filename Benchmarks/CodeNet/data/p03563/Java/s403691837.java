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
        int r = sc.nextInt();
        int g = sc.nextInt();
        out.println(g * 2 - r);
    }
}
