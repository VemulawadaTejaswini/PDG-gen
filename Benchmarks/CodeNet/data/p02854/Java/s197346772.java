import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        long min = sum;
        long asum = 0;
        for (int i = 0; i < n - 1; i++) {
            asum += a[i];
            sum -= a[i];
            min = Math.min(min, Math.abs(sum - asum));
        }
        System.out.println(min);
    }

}
