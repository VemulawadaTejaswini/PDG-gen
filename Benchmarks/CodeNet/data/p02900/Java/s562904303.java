import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = lcm(a,b);
        List<Long> li = fact(x);
        long ans = ((li.size()*li.size())-li.size())/2;
        System.out.pritnln(ans);
    }

    static List<Long> fact(long x) {
        HashSet<Long> result = new HashSet<>();
        while (x >= 4 && x % 2 == 0) {
            result.add(2);
            x /= 2;
        }
        int d = 3;
        int q = x / d;
        while (q >= d) {
            if (x % d == 0) {
                result.add(d);
                x = q;
            } else {
                d += 2;
            }
            q = x / d;
        }
        result.add(x);
        return result;
    }

    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }

}
