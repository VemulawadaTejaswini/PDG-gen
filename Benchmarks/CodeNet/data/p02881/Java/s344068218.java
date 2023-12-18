import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        scan.close();

        long ans = N + 1 - 2;
        long tmp = 0;
        for (long i = 2; i < N; i++) {
            System.out.println(i);
            tmp = N / i;
            if (N % i == 0 && tmp + i < ans) {
                ans = tmp + i - 2;
            }
            if (i > tmp) {
                break;
            }
        }
        System.out.println(ans);
    }
}