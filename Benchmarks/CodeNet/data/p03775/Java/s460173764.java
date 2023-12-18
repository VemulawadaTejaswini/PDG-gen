import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min = 1000000000;
        for (long i = 1; i <= (long)Math.sqrt(n); i++) {
            if (n % i == 0) {
                long a = i;
                long b = n / i;
                min = Math.min(min, f(a,b));
            }
        }
        System.out.println(min);
    }

    public static long f(long a, long b) {
        long num = Math.max(a,b);
        long digits = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }
}