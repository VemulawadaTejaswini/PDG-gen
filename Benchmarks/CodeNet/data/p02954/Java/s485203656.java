

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] chars = scanner.nextLine().toCharArray();
        final int[] answer = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') {
                final int lIndex = findLIndex(chars, i);
                if ((lIndex - i) % 2 == 0) {
                    answer[lIndex]++;
                } else {
                    answer[lIndex - 1]++;
                }
            } else {
                final int rIndex = findRIndex(chars, i);
                if ((i - rIndex) % 2 == 0) {
                    answer[rIndex]++;
                } else {
                    answer[rIndex + 1]++;
                }
            }
        }

        for (final int i : answer) {
            System.out.print(i + " ");
        }

    }

    private static int findRIndex(final char[] chars, final int index) {
        final String s = new String(chars);
        return s.lastIndexOf('R', index);
    }

    private static int findLIndex(final char[] chars, final int index) {
        final String s = new String(chars);
        return s.indexOf('L', index);
    }
}
