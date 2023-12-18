import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        int[] x = new int[100010];

        for (int i = 0; i < n; i++) {
            x[d[i]]++;
        }

        for (int i = 1; i < 100010; i++) {
            x[i] += x[i-1];
        }

        System.out.println(IntStream.of(x).filter(i -> i == (n / 2)).count());

    }
}
