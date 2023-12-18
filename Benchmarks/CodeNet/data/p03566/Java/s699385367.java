import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int[] t = new int[N];
            for (int i = 0; i < N; i++) {
                t[i] = in.nextInt();
            }

            int[] v = new int[N];
            for (int i = 0; i < N; i++) {
                v[i] = in.nextInt();
            }

            int sumTime = 1;
            for (int i = 0; i < N; i++) {
                sumTime += t[i];
            }

            int[] speed = new int[sumTime];
            for (int i = 0, si = 0; i < N; i++) {
                for (int j = 0; j < t[i]; j++) {
                    speed[si++] = v[i];
                }
            }
            speed[0] = 0;
            speed[speed.length - 1] = 0;

            for (;;) {
                boolean update = false;
                for (int i = 0; i + 1 < speed.length; i++) {
                    if (speed[i + 1] > speed[i] + 1) {
                        speed[i + 1] = speed[i] + 1;
                        update = true;
                    }
                }
                for (int i = speed.length - 1; i - 1 >= 0; i--) {
                    if (speed[i - 1] > speed[i] + 1) {
                        speed[i - 1] = speed[i] + 1;
                        update = true;
                    }
                }
                if (!update) {
                    break;
                }
            }

            Utils.debug(speed);

            double sum = 0;
            for (int i = 0; i + 1 < speed.length; i++) {
                sum += (speed[i + 1] + speed[i]) / 2.0;
                Utils.debug(i, sum, speed[i + 1], speed[i]);
            }

            System.out.println(sum);

        }
    }

}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
