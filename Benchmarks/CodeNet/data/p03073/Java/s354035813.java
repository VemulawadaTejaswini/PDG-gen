

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final String s = sc.next();
            if (s.length() == 1) {
                System.out.println(0);
            } else {
                final String zeroOne = generateMask(s.length(), '0');
                final String oneZero = generateMask(s.length(), '1');
                System.out.println(Math.min(calc(s, zeroOne), calc(s, oneZero)));
            }
        }
    }

    private static int calc(final String s, final String mask) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != mask.charAt(i)) {
                count += 1;
            }
        }
        return count;
    }

    static String generateMask(final int size, final char first) {
        final char[] buf = new char[size];
        buf[0] = first;
        for (int i = 1; i < size; i++) {
            buf[i] = buf[i - 1] == '0' ? '1' : '0';
        }
        return new String(buf);
    }
}
