import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        long[] x = new long[5];
        long n = sc.nextLong();
        x[0] = sc.nextLong();
        x[1] = sc.nextLong();
        x[2] = sc.nextLong();
        x[3] = sc.nextLong();
        x[4] = sc.nextLong();
        long count = 0;

        Arrays.sort(x);
        count = n / x[0] + 1;
        count += 4;

        System.out.println(count);
    }
}