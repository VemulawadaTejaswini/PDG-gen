
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int m = scanner.nextInt();
        long digit = 0;
        long all = 0;
        for (int i = 0; i < m; i++) {
            final long d = scanner.nextLong();
            final long c = scanner.nextLong();

            digit += c;
            all += d * c;
        }

        long answer = digit - 1 + all / 10;
        long each = sumDigit(all);
        while (each >= 10) {
            answer++;
            each = sumDigit(each);
        }
        System.out.println(answer);
    }

    private static long sumDigit(final long value) {
        final String[] array = Long.toString(value).split("");
        return Arrays.stream(array)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
