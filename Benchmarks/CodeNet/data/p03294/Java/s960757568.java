import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        long m = lcm(a) - 1;
        System.out.println(Arrays.stream(a).mapToLong(i -> m % i).sum());
    }

    public static long lcm(int... array) {
        BigInteger j = BigInteger.valueOf(array[0]), temp;
        for (int i = 1; i < array.length; i++)
            j = j.multiply(temp = BigInteger.valueOf(array[i])).divide(j.gcd(temp));
        return j.longValue();
    }
}