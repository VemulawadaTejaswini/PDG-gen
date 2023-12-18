import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        long T = sc.nextLong();

        long currentStart = sc.nextLong();
        long currentEnd = currentStart + T;
        long sum = 0;
        for (int i = 1; i < N; i++) {
            long t = sc.nextLong();

            if (t <= currentEnd) {
                currentEnd = t + T;
            } else {
                sum += currentEnd - currentStart;
                currentStart = t;
                currentEnd = t + T;
            }
        }
        sum += currentEnd - currentStart;
        System.out.println(sum);
    }
}