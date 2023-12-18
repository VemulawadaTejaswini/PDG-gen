import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 100000; i++) {
            if (isPrime(i) && isPrime((i + 1) / 2)) {
                numbers.add(i);
            }
        }

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = count(numbers, r) - count(numbers, l);
            System.out.println(count);
        }
    }

    private static int count(List<Integer> xs, int x) {
        int returnValue = Collections.binarySearch(xs, x);
        if (returnValue >= 0) {
            return returnValue;
        } else {
            return -returnValue - 1;
        }
    }

    private static boolean isPrime(int x) {
        return BigInteger.valueOf(x).isProbablePrime(100);
    }
}
