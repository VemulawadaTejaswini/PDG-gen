import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        a[n] = x;
        Arrays.sort(a);
        int[] b = new int[n];
        for (int i = 0 ; i < n - 1 ; i++) {
            b[i] = a[i + 1] - a[i];
        }
        int ans = gcd(b[0], b[1]);
        for (int i = 2 ; i < n ; i++) {
            ans = gcd(ans, b[i]);
        }
        System.out.println(ans);


    }
    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}
