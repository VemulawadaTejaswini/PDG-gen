
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        double tanTheta;
        if (a * a * b / 2 < x) {
            tanTheta = 2 * (a * a * b - x) / (a * a * a);
        } else {
            tanTheta = (a * b * b) / (2 * x);
        }
        double theta = Math.toDegrees(Math.atan(tanTheta));

        System.out.println(theta);
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
