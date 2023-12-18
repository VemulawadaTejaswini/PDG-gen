import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 100000; i += 2) {
            if (isPrime(i) && isPrime((i + 1) / 2)) {
                numberList.add(i);
            }
        }
        int[] numbers = numberList.stream().mapToInt(i -> i).toArray();
        // System.out.println(numbers.size());

        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            int count = count(numbers, r) - count(numbers, l - 1);
            System.out.println(count);
        }
    }

    private static int count(int[] xs, int x) {
        int returnValue = Arrays.binarySearch(xs, x);
        if (returnValue >= 0) {
            return returnValue + 1;
        } else {
            return -returnValue - 1;
        }
    }

    private static boolean isPrime(int x) {
        return BigInteger.valueOf(x).isProbablePrime(100);
    }
}
