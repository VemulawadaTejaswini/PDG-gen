import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long[] sum = new long[n + 1];
        for (int i = 0 ; i < n ; i++) {
            sum[i + 1] += (long) a[i] + sum[i];
        }

        int count = 0;
        for (int i = 1 ; i < n ; i++) {
            if (a[i] > sum[i] * 2) count = i;
        }

        System.out.println(n -  count);
    }

}