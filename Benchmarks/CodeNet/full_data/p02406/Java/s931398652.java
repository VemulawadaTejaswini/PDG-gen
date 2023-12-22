import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 3; i <= n; i += 1) {
            boolean digit = true;
            int x = i;
            if (i % 3 == 0) {
                out.printf(" %d", i); 
            } else if (i % 10 == 3) {
                while (x > 10) {
                    out.printf(" %d", x); 
                    x /= 10; 
                }
            }
        }
        out.println();
    }   
}  