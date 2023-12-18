import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        System.out.println(max - min);
    }
}