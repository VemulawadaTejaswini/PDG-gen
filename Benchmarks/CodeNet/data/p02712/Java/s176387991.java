
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author azize
   
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();

        long ans = 0;
        int state = 0;
        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            } 

            ans += i;
        }

        out.println(ans);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
