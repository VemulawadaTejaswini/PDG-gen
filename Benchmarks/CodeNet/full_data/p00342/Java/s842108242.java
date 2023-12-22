import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long cd, ab;
        double result;

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);
        result = (double)(a[n - 1] + a[n - 2]) / (double)(a[1] - a[0]);
        for(int i = 1; i < n - 1; i++) {
            if(i + 1 == n - 1) {
                cd = a[n - 1] - a[n - 2];
                ab = a[n - 3] + a[n - 4];
            } else if(i + 1 == n - 2) {
                cd = a[n - 2] - a[n - 3];
                ab = a[n - 1] + a[n - 4];
            } else {
                cd = a[i + 1] - a[i];
                ab = a[n - 1] + a[n - 2];
            }
            result = Math.max(result, (double)ab / (double)cd);
        }
        System.out.printf("%.6f\n", result);
        }
}