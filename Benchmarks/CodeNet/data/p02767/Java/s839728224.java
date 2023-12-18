import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        System.out.println(stamina(x));

    }

    private static int stamina(int[] x) {
        int count = Arrays.stream(x).sum();
        int p = count / x.length;
        if (count % x.length == 0) {
            return Arrays.stream(x).map(i -> (i - p) * (i - p)).sum();
        } else {
            return IntStream.of(p, p + 1).map(t -> Arrays.stream(x).map(i -> (i - p) * (i - p)).sum()).min().getAsInt();
        }
    }
}