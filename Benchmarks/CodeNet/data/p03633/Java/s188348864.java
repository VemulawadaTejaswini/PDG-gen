import java.util.*;
import java.io.*;
 
public class Main{ 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] t = new long[n];
        for(int i = 0; i < n; i++){
            t[i] = scanner.nextLong();
        }
        long cur = t[0];
        for(int i = 1; i < n; i++){
            cur = lcm(cur, t[i]);
        }
        System.out.println(cur);
    }
    public static long gcd(long a, long b) {
        return b == 0 ? a: gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}