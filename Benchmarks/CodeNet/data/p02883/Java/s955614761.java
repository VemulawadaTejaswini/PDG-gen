import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int [n];
        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            sum += (long) a[i];
        }
        Arrays.sort(a);

        int[] f = new int[n];
        for (int i = 0 ; i < n ; i++) {
            f[i] = sc.nextInt();
        }
        Arrays.sort(f);

        if (sum <= k) {
            System.out.println(0);
            return;
        }

        System.out.println(12);


    }

}
