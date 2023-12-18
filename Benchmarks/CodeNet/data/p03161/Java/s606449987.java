import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = in.nextInt();
        }
        if (n == 1) {
            System.out.println(0); return;
        }
        int[] min = new int[n];
        Arrays.fill(min, Integer.MAX_VALUE);
        min[0] = 0;
        min[1] = Math.abs(h[1] - h[0]);
        for (int i = 2 ; i < n ; i++) {
            for (int j = Math.max(0, i - k) ; j < i ; j++) {
                min[i] = Math.min(min[i], min[j] + Math.abs(h[i] - h[j]));
            }
        }
        System.out.println(min[n-1]);
    }
}
