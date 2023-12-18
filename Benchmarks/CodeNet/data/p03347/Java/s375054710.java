
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream ps = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (a[0] != 0) {
            ps.println(-1);
            return;
        }
        long count = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i-1] + 1) {
                ps.println(-1);
                return;
                
            } else if (a[i] == a[i-1] + 1) {
                count++;
                
            } else {
                count += a[i];
            }
        }
        ps.println(count);
    }
}
