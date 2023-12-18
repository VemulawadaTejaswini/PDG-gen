import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] count = new int[n];
        for (int i = 0; i < m; i++) {
            count[scanner.nextInt() - 1]++;
            count[scanner.nextInt() - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (count[i] % 2 == 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}