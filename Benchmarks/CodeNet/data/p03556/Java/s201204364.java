import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static final void NO() { out.println("NO"); }
    public static final void YES() { out.println("YES"); }

    public static final void main(String[] args) {
        new Main().solve();
        out.flush();
    }

    // ========================================================================= //

    public void solve() {
        long N = sc.nextInt();
        long sqrt = (long)Math.ceil(Math.sqrt(N));
        while (sqrt * sqrt > N) {
            sqrt--;
        }
        System.out.println(sqrt * sqrt);
    }

}

