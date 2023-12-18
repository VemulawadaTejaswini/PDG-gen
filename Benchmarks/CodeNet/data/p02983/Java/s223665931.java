import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long l = sc.nextInt();
        long r = sc.nextInt();
        long ans = 2019;

        for (long i = l; i < r; i++) {
            for (long j = i + 1; j <= r; j++) {
                long value = i * j % 2019;
                ans = Math.min(ans, value);
                if (ans == 0) {
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}