import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] ans = new int[n + 1];
        for (int i = 2; i <= n; ++i) {
            ++ans[in.nextInt()];
        }
        for (int i = 1; i <= n; ++i) {
            out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
