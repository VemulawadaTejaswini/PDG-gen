import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        long n = Long.parseLong(input);

        List<Long> primitives = getPrimitives(n);
        long min = 1L + (long) Math.log10(n);
        long a = 1;
        long b = n;

        for (Long p: primitives) {
            a *= p;
            b /= p;
            long f = Math.max((long) Math.log10(a) + 1, (long) Math.log10(b) + 1);
            min = Math.min(min, f);
        }

        System.out.println(min);
    }

    private static List<Long> getPrimitives(long n) {
        List<Long> ret = new LinkedList<>();
        ret.add(1L);
        if (n == 1) {
            ret.add(1L);
            return ret;
        }

        long p = 2L;
        while (n > 1) {
            if (n % p == 0) {
                n /= p;
                ret.add(p);
            }
            else p ++;
        }

        return ret;
    }
}