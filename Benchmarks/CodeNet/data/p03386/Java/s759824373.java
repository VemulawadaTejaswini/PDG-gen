import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final long A = Long.parseLong(sc.next());
        final long B = Long.parseLong(sc.next());
        final int K = Integer.parseInt(sc.next());
 
        if (B - A + 1 >= 2 * K) {
            for (int i = 0; i < K; i++) {
                out.println(A + i);
            }
            for (int i = K - 1; i >= 0; i--) {
                out.println(B - i);
            }
        } else {
            for (long i = A; i <= B; i++) {
                out.println(i);
            }
        }
          
        out.flush();
    }
}