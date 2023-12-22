import java.io.PrintWriter;
import java.util.*;

public class Main {

    static Scanner sc;
    static PrintWriter out;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    public void solve() {
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();


        long res = b * c;
        res = Math.max(res, b * d);
        res = Math.max(res, a * c);
        res = Math.max(res, a * d);

        out.println(res);
    }



}