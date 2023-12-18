import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long l = scanner.nextInt() % 2019;
        long r = scanner.nextInt() % 2019;
        long min = Long.MAX_VALUE;
        for (long i = l; i <= r; i++) {
            for (long j = i + 1; j <= r; j++) {
                min = Math.min(min, i * j % 2019);
            }
        }
        System.out.println(min);
    }
}