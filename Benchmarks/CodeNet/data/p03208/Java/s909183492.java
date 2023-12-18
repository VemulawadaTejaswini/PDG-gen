import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }
        Arrays.sort(h);
        long min = Long.MAX_VALUE;
        for (int i = 0; i <= n-k; i++) {
            min = Math.min(min, h[i+(k-1)] - h[i]);
        }
        System.out.println(min);
    }
}
