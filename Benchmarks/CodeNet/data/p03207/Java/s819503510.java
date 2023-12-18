import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            max = Math.max(max, p);
            sum += p;
        }
        System.out.println(sum - max / 2);
    }
}