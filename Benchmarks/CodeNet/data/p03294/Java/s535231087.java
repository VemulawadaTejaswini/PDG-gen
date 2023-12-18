import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        long temp = 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            temp *= a[i] = scanner.nextInt();
        long m = temp - 1;
        System.out.println(Arrays.stream(a).mapToLong(i -> m % i).sum());
    }
}