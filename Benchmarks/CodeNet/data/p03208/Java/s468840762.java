import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        Arrays.sort(h);
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            smallest = Math.min(smallest, h[i + k - 1] - h[i]);
        }
        System.out.println(smallest);
    }
}
