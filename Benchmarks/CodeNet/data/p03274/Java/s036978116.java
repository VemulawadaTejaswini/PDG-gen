import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int lowerBound = -(Arrays.binarySearch(array, - 0.1)) - 1;
        int start = Math.max(lowerBound - k + 1, 0);
        double ans = Double.MAX_VALUE;
        for (int i = start; i <= n - k; i++) {
            double min = array[i];
            double max = array[i + k - 1];
            double time;
            double absMax = Math.max(Math.abs(min), Math.abs(max));
            if (min * max < 0) {
                double absMin = Math.min(Math.abs(min), Math.abs(max));
                time = 2 * absMin + absMax;
            } else {
                time = absMax;
            }
            ans = Math.min(time, ans);
        }
        System.out.println((long) ans);
    }
}