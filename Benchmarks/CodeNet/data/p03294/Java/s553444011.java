import java.math.BigInteger;
import java.util.stream.Stream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long m = lcm(7, 46, 11, 20, 11) - 1;
        System.out.println(Stream.of(7, 46, 11, 20, 11)
                    .mapToLong(i -> m % i)
                    .sum());
    }

    public static long lcm(int... array) {
        BigInteger j = BigInteger.valueOf(array[0]), temp;
        for (int i = 1; i < array.length; i++)
            j = j.multiply(temp = BigInteger.valueOf(array[i])).divide(j.gcd(temp));
        return j.longValue();
    }
}