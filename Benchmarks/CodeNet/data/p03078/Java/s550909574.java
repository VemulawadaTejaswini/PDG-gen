
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int aLength = scanner.nextInt();
        final int bLength = scanner.nextInt();
        final int cLength = scanner.nextInt();
        final int choice = scanner.nextInt();

        final long[] a = new long[aLength];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextLong();
        }

        final long[] b = new long[bLength];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextLong();
        }

        final long[] c = new long[cLength];
        for (int i = 0; i < c.length; i++) {
            c[i] = scanner.nextLong();
        }

        final long[] ab = new long[aLength * bLength];
        int count = 0;
        for (final long aValue : a) {
            for (final long bValue : b) {
                ab[count++] = aValue + bValue;
            }
        }

        final long[] sortedAB = Arrays.stream(ab).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToLong(Long::longValue)
                .toArray();

        final long[] filteredAB = new long[Math.min(choice,sortedAB.length)];

        System.arraycopy(sortedAB, 0, filteredAB, 0, filteredAB.length);

        final long[] answers = new long[filteredAB.length * cLength];
        int countAnswers = 0;
        for (final long abValue : filteredAB) {
            for (final long cValue : c) {
                answers[countAnswers++] = abValue + cValue;
            }
        }

        final long[] sortedAnswer = Arrays.stream(answers).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToLong(Long::longValue).
                        toArray();

        for (int i = 0; i < choice; i++) {
            System.out.println(sortedAnswer[i]);
        }
    }
}
