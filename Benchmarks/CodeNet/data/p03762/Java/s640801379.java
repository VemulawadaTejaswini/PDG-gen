
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    private static long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt(), m = fs.nextInt();
        System.out.println((helper(fs, n) * helper(fs, m)) % MOD);
    }

    private static long helper(Scanner fs, int n) {
        long ans = 0L;
        long prev = fs.nextLong();
        for (int i = 1; i < n; ++i) {
            long x = fs.nextLong();
            ans = (ans + (x - prev) * i % MOD * (n - i) % MOD);
            prev = x;
        }
        return ans;
    }
}
