import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();
        long ans = 0;
        Arrays.sort(a);
        for (int i = 0; i < n-1; i++) {
            ans += Math.abs(a[i+1]-a[i]);
        }
        System.out.println(ans);
        sc.close();
    }
}
