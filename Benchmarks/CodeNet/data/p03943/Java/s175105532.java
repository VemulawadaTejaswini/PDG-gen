import java.io.*;
import java.util.*;

public class Main {
    private static boolean elapsed = false;

    private void solve(Scanner sc, PrintWriter out) {
        int a = sc.nextInt();   
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b == c || a + c == b || b + c == a) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(sc, out);
        out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            System.err.println((G - S) + "ms");
        }
    }
}