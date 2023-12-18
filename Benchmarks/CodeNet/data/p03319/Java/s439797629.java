import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream ps = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = -1; 
        
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                c = i;
            }
        }

        if (n == k) {
            ps.println(1);
            return;
        }
        int ans = f(c, k-1) + f(n-c-1, k-1);
        ps.println(ans);
    }
    
    static int f(int a, int b) {
        return (a + b - 1) / b;
    }
}
