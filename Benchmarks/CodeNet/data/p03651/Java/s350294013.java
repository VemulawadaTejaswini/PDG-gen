import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[] a = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
        System.out.println(k <= Arrays.stream(a).max().getAsInt() && k % gcd(a) == 0 ? "POSSIBLE" : "IMPOSSIBLE");
    }

    public static int gcd(int... array) {
        BigInteger j = BigInteger.valueOf(array[0]);
        for (int i = 1; i < array.length; i++)
            j = j.gcd(BigInteger.valueOf(array[i]));
        return j.intValue();
    }
}