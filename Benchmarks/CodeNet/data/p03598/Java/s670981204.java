import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            sum += Math.min(k - x, x) * 2;
        }
        System.out.println(sum);
    }
}