import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] locations = new int[n];
        for(int i = 0; i < n; i++)
            locations[i] = sc.nextInt();

        long minDist = Long.MAX_VALUE;
        for(int i = 0; i <= n - k; i++) {
            int left = locations[i];
            int right = locations[i + k - 1];
            minDist = Math.min(minDist,
                right - left + Math.min(Math.abs(left), Math.abs(right))
            );
        }
        System.out.println(minDist);
    }
}
