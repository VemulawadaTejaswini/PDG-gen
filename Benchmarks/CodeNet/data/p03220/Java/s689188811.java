import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();

        int[] h = new int[n];
        for (int i = 0; sc.hasNextInt(); i++) {
            h[i] = sc.nextInt();
        }

        int maxIndex = 0;
        double val = Math.abs(a - ave(t, h[0]));
        for (int i = 1; i < h.length; i++) {
            double target = Math.abs(a - ave(t, h[i]));
            if (val > target) {
                maxIndex = i;
                val = target;
            }
        }

        System.out.println(maxIndex + 1);
    }

    static double ave(int t, int h) {
        return t - (h * 0.006);
    }
}