import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - i;
        }
        Arrays.sort(a);
        int mid;
        if (n % 2 == 1) {
            mid = a[(n - 1) / 2];
        } else {
            mid = (a[n / 2] + a[n / 2 - 1]) / 2;
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(a[i] - mid);
        }
        System.out.println(sum);
    }
}