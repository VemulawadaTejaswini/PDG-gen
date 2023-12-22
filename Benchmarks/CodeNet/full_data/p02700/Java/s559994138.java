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
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = in.nextInt();
        
      int turn = 0;
      while (a > 0 && c > 0) {
        if (turn % 2 == 0) {
          c -= b;
        } else {
          a -= d;
        }
        ++turn;
      }
      
      System.err.println(a + " " + c);
      out.println(a > 0 ? "Yes" : "No");

    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
