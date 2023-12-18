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
        long current_lcm = T[0];
        for (int i = 0; i < T.length; i++) {
            current_lcm = lcm(T[i], current_lcm);
        }
        return current_lcm;
    }
    public static long lcm(long x, long y) {
        long gcd = gcd(x, y);
        return x/gcd*y;
    }
    public static long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
