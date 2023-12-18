import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] T = new long[N];
        for (int i = 0; i < N; i++) {
            T[i] = scan.nextLong();
        }
        long answer = solve(T);
        System.out.println(answer);
    }
    public static long solve(long[] T) {
        long current_gcd = 0;
        long current_lcm = 0;
        for (int i = 0; i < T.length; i++) {
            long prev = current_gcd;
            current_gcd = gcd(T[i], current_gcd);
            current_lcm = T[i] / current_gcd * prev;
        }
        return current_lcm;
    }
    public static long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
