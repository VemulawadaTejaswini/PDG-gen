import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();

        int count = 0;
        int rMax = n / R;
        for (int r = 0; r <= rMax; r++) {
            int gMax = (n - R * r) / G;
            for (int g = 0; g <= gMax; g++) {
                int b = (n - R * r - G * g) / B;
                if (r * R + g * G + b * B == n) count++;
            }
        }
        // write your code
        System.out.println(count);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
