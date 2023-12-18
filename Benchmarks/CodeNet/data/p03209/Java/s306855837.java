
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextLong();
        final long x = scanner.nextLong();

        System.out.println(recursive(0L, n, x));
    }

    private static long recursive(final long answer, final long level, final long point) {
        if (level == 0L) {
            return answer;
        }

        final long burger = 4L * (long) Math.pow(2L, level) - 3L;
        final long patty = 2L * (long) Math.pow(2L, level - 1) - 1L;

        if (point == 0L) {
            return answer;
        }

        if (point == burger) {
            return answer + 2L * patty + 1L;
        }

        if (point == (burger + 1L) / 2L) {
            return answer + patty + 1L;
        }

        if (point < (burger + 1L) / 2L) {
            return recursive(answer, level - 1L, point - 1L);
        }

        return recursive(answer + patty + 1L, level - 1L, point - (burger + 1L) / 2L);
    }
}
