import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] sect = new long[n];
        long[] sum = new long[n];
        sect[0] = sc.nextLong();
        sum[0] = sect[0];
        for (int i = 1; i < n; i++) {
            sect[i] = sc.nextLong();
            sum[i] = sect[i] + sum[i - 1];
        }
        double center = (double) sum[n - 1] / 2;
        double dist = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            dist = Math.min(Math.abs(sum[i] - center), dist);
        }
        System.out.println((int) (dist * 2));
    }
}
