import java.util.*;
 
public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i * m + j * n - i * j * 2 == k) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}