import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final Integer[] values = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);

        if (values.length == 2) {
            System.out.println(Math.max(values[0], values[1]));
            return;
        }

        int[] gcdL = new int[values.length];
        int[] gcdR = new int[values.length];

        gcdL[0] = values[0];
        gcdR[values.length - 1] = values[values.length - 1];
        for (int i = 1; i < values.length; i++) {
            gcdL[i] = gcd(gcdL[i - 1], values[i]);
            gcdR[values.length - i - 1] = gcd(gcdR[values.length - i], values[values.length - 1 - i]);
        }

        int max = 0;
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                max = Math.max(max, gcdR[i + 1]);
            } else if (i == values.length - 1) {
                max = Math.max(max, gcdL[i - 1]);
            } else {
                max = Math.max(max, gcd(gcdL[i - 1], gcdR[i + 1]));
            }
        }

        System.out.println(max);
    }

    private static int gcd(int a, int b) {
        if (a == b) return a;
        if (a < b) return gcd(b, a);
        if (a % b == 0) return b;

        return gcd(b, (a % b));
    }
}