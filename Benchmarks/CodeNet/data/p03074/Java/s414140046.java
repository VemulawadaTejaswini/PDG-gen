

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final int n = sc.nextInt();
            final int k = sc.nextInt();
            final String s = sc.next();

            final char first = s.charAt(0);
            final int[] cumulatives = new int[n + 1];
            int cSize = 0;
            cumulatives[cSize++] = 0;
            if (first == '0') {
                cumulatives[cSize++] = 0;
            }
            char prev = first;
            int len = 0;
            for (int i = 0; i < n; i++) {
                final char current = s.charAt(i);
                if (current != prev) {
                    cumulatives[cSize] = cumulatives[cSize - 1] + len;
                    cSize++;
                    len = 1;
                } else {
                    len += 1;
                }
                prev = current;
            }
            if (len > 0) {
                cumulatives[cSize] = cumulatives[cSize - 1] + len;
                cSize++;
            }
            int answer = 0;
            for (int left = 0, right = Math.min(left + 2 * k + 1, cSize - 1); left < cSize; left += 2, right = Math
                    .min(left + 2 * k + 1, cSize - 1)) {
                final int value = cumulatives[right] - cumulatives[left];
                answer = Math.max(answer, value);
            }
            System.out.println(answer);
        }
    }

}
