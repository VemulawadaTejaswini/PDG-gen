import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        long ans = 0;
        int t = a[0];
        for (int i = 1 ; i < n ; i++) {
            if (a[i] < t) {
                ans += (long)( t - a[i]);
            }
            if (a[i] > t) {
                t = a[i];
            }
        }
        System.out.println(ans);
    }

}