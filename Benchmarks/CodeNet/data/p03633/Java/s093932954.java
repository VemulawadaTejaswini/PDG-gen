import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] T = new long[n];
        Arrays.setAll(T, i -> Long.parseLong(sc.next()));
        Arrays.sort(T);
        long res = 1;
        for(long t : T) res = lcm(Math.max(res, t), Math.min(res, t));
        System.out.println(res);
    }
    static long gcd(long x, long y) {
        long m;
        while((m = x % y) != 0) {
            x = y;
            y = m;
        }
        return y;
    }
    static long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }
}
