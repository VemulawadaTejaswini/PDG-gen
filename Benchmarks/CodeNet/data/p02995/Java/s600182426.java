import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        final long c = scanner.nextLong();
        final long d = scanner.nextLong();

        final long gcdVal = gcd(c, d);
        final long cd = c / gcdVal * d;

        long minValueDivByC = (a / c) * c;
        if (minValueDivByC != a) minValueDivByC += c;

        long minValueDivByD = (a / d) * d;
        if (minValueDivByD != a) minValueDivByD += d;

        long minValueDivByCD = (b / cd) * cd;
        if (minValueDivByCD != a) minValueDivByCD += cd;


        long maxValueDivByC = (b / c) * c;
        if (maxValueDivByC != b) maxValueDivByC -= c;

        long maxValueDivByD = (b / d) * d;
        if (maxValueDivByD != b) maxValueDivByD -= d;

        long maxValueDivByCD = (b / cd) * cd;
        if (maxValueDivByCD != b) maxValueDivByCD -= cd;


        long sum = (maxValueDivByC - minValueDivByC) / c + 1L;
        sum += (maxValueDivByD - minValueDivByD) / d + 1L;
        sum -= (maxValueDivByCD - minValueDivByCD) / cd + 1L;

        System.out.println(b - a - sum + 1L);
    }

    private static long gcd(long a, long b) {
        if (a < b) {
            return gcd(b, a);
        }

        if (b == 0) return a;

        return gcd(b, a % b);
    }
}