import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = n, t = 1; i > 0; i--, t *= 2) {
            min = Math.min(min, t + i * k);
        }
        System.out.println(min);
    }
}