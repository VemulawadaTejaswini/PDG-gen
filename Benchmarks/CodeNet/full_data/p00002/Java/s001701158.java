import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();

            out.println(Integer.toString(a+b).length());
        }
    }

}

