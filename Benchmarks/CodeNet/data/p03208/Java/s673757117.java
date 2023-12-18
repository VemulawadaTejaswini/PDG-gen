import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }
        Arrays.sort(h);
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            long min = Stream.of(h[i], h[i + 1], h[i + 2]).mapToLong(Long::longValue).min().getAsLong();
            long max = Stream.of(h[i], h[i + 1], h[i + 2]).mapToLong(Long::longValue).max().getAsLong();
            ans = Math.min(ans, Math.abs(max-min));
        }
        System.out.println(ans);
    }
}