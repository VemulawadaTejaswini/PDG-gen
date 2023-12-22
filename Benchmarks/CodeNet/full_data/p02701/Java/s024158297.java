
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
 * 
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
        HashSet<String> set = new HashSet<>();
        int n = in.nextInt();
        while (n-->0) {
          set.add(in.next());
        }

        out.println(set.size());
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
