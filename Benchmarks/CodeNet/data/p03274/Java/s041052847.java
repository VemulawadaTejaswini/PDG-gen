import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n - k; i++) {
            int min = array[i];
            int max = array[i + k - 1];
            if (min > 0) {
                min = 0;
            }

            if (max < 0) {
                max = 0;
            }

            int maxAbs = Math.abs(max);
            int minAbs = Math.abs(min);

            if (maxAbs > minAbs) {
                minAbs = minAbs * 2;
            } else {
                maxAbs = maxAbs * 2;
            }

            if (ans > maxAbs + minAbs) {
                ans = maxAbs + minAbs;
            }

        }

        System.out.println(ans);

    }
}