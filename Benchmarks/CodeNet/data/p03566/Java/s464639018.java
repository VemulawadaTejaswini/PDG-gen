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

            int sumTime = 0;
            for (int i = 0; i < N; i++) {
                sumTime += t[i];
            }

            // max speed of segment
            int[] maxSpeed = new int[sumTime];
            // Arrays.fill(maxSpeed, (int) 1e9);
            for (int i = 0, si = 0; i < N; i++) {
                for (int j = 0; j < t[i]; j++) {
                    maxSpeed[si] = v[i];
                    // speed[si] = v[i];
                    si++;
                }
            }
            // speed at the point
            int[] speed = new int[sumTime + 1];
            // for (int i = 0, si = 0; i < N; i++) {
            // for (int j = 0; j < t[i]; j++) {
            // maxSpeed[si] = v[i];
            // speed[si] = v[i];
            // si++;
            // }
            // }
            for (int i = 0; i < speed.length; i++) {
                speed[i] = i == speed.length - 1 ? maxSpeed[i - 1] : i == 0 ? maxSpeed[i] : Math.min(maxSpeed[i - 1], maxSpeed[i]);
            }

            // for (int i = 0, si = 0; i + 1 < maxSpeed.length; i++) {
            // // for (int j = 0; j < t[i]; j++) {
            // // if (si - 1 >= 0) {
            // // maxSpeed[si] = Math.min(maxSpeed[si], maxSpeed[si - 1]);
            // // }
            // maxSpeed[si] = Math.min(maxSpeed[si], maxSpeed[si + 1]);
            // speed[si++] = maxSpeed[si];
            // // }
            // }

            // for (int i = 0, si = 0; i + 1 < maxSpeed.length; i++) {
            // // for (int j = 0; j < t[i]; j++) {
            // if (si - 1 >= 0) {
            // maxSpeed[si] = Math.min(maxSpeed[si], maxSpeed[si - 1]);
            // speed[si] = Math.min(speed[si], speed[si - 1]);
            // }
            // maxSpeed[si] = Math.min(maxSpeed[si], maxSpeed[si + 1]);
            // speed[si] = Math.min(speed[si], speed[si + 1]);
            // // speed[si++] = maxSpeed[si];
            // // }
            // si++;
            // }

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

            // for (int i = 0, si = 0; i + 1 < maxSpeed.length; i++) {
            // // for (int j = 0; j < t[i]; j++) {
            // // if (si - 1 >= 0) {
            // // maxSpeed[si] = Math.min(maxSpeed[si], maxSpeed[si - 1]);
            // // speed[si] = Math.min(speed[si], speed[si - 1]);
            // // }
            // maxSpeed[si] = Math.min(maxSpeed[si], maxSpeed[si + 1]);
            // speed[si] = Math.min(speed[si], speed[si + 1]);
            // // speed[si++] = maxSpeed[si];
            // // }
            // si++;
            // }

            for (int i = 0; i < speed.length; i += 10) {
                Utils.debug(Arrays.copyOfRange(speed, i, i + 10));
            }

            double sum = 0;
            for (int i = 0; i + 1 < speed.length; i++) {
                sum += (speed[i + 1] + speed[i]) / 2.0;
                if (speed[i + 1] == speed[i] && speed[i] != maxSpeed[i]) {
                    sum += 0.25;
                }
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
