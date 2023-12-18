
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] a = scanner.next().toCharArray();
        final char[] b = scanner.next().toCharArray();
        final char[] c = scanner.next().toCharArray();

        final int aToB = count(a, b);
        final int aToC = count(a, c);
        final int bToA = count(b, a);
        final int bToC = count(b, c);
        final int cToA = count(c, a);
        final int cToB = count(c, b);

        int min = calc(aToB, bToC, a.length, b.length, c.length);
        min = Math.min(min, calc(aToC, cToB, a.length, c.length, b.length));
        min = Math.min(min, calc(bToC, cToA, b.length, c.length, a.length));
        min = Math.min(min, calc(bToA, aToC, b.length, a.length, c.length));
        min = Math.min(min, calc(cToA, aToB, c.length, a.length, b.length));
        min = Math.min(min, calc(cToB, bToA, c.length, b.length, a.length));

        System.out.println(min);
    }

    private static int calc(final int aToB, final int bToC, final int aLength, final int bLength, final int cLength) {
        if (aToB != -1 && bToC != -1) {
            return aToB + bToC + cLength;
        } else if (aToB != -1) {
            return aToB + bLength + cLength;
        } else if (bToC != -1) {
            return aLength + bToC + cLength;
        } else {
            return aLength + bLength + cLength;
        }
    }

    private static int count(final char[] a, final char[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length - i; j++) {
                if (a[i + j] == '?' || b[j] == '?') {
                    continue;
                }
                if (a[i + j] != b[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
