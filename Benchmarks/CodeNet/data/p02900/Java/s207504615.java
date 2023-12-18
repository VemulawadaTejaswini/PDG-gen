import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static List<Long> factorize(long x) {
        List<Long> result = new ArrayList<>();
        for (long i = 1; i <= x / 2; i++) {
            long finalI = i;
            if (x % i == 0 && result.stream().noneMatch(elm -> elm != 1 && finalI % elm == 0)) {
                result.add(i);
            }
        }
        if (result.stream().noneMatch(elm -> elm != 1 && x % elm == 0)) {
            result.add(x);
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long gcd = gcd(a, b);
        System.out.println(factorize(gcd).size());
    }
}
