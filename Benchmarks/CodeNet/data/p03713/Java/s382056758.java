import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a[] = new long[2];
        a[0] = in.nextLong();
        a[1] = in.nextLong();

        if (a[0] % 3 == 0 || a[1] % 3 == 0) {
            System.out.println(0);
            return;
        }

        Arrays.sort(a);
        long area = a[0];
        area *= a[1];

        long min = Long.MAX_VALUE;
        for (int i = 1; i <= a[1]; i++) {
            long b[] = new long[3];
            b[0] = a[0] * i;
            b[1] = (a[0] / 2) * (a[1] - i);
            b[2] = area - b[0] - b[1];
            Arrays.sort(b);
            min = Math.min(min, b[2] - b[0]);

            long c[] = new long[3];
            c[0] = a[0] * i;
            c[1] = ((a[1] - i) / 2) * a[0];
            c[2] = area - c[0] - c[1];
            Arrays.sort(c);
            min = Math.min(min, c[2] - c[0]);
        }

        System.out.println(min);
    }
}
