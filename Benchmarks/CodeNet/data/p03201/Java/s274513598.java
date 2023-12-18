import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int b = a[n - 2] + a[n - 1];
        int m = 0;
        while (b / 2 > 0) {
            m++;
            b /= 2;
        }
        int check[] = new int[n];
        int count = 0;
        while (m > 0) {
            int d[] = new int[n];
            int c[] = new int[n];
            for (int i = 0; i < n; i++) {
                int mod = (int) Math.pow(2, m);
                d[i] = a[i] % mod;
                c[i] = mod - d[i];
            }
            for (int i = 0 ; i < n ; i++) {
                int result = Arrays.binarySearch(d, c[i]);
                if (result >= 0 && check[i] == 0 && check[result] == 0 && i != result) {
                    count++;
                    check[i]++;
                    check[result]++;
                }
            }
            m--;
        }

        System.out.println(count);
    }

}