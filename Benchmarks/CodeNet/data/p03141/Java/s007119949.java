import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int sum[] = new int[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum[i] = a[i] + b[i];
            ans += a[i];
        }
        Arrays.sort(sum);
        sc.close();
        for (int i = n - 2; 0 <= i; i -= 2) {
            ans -= sum[i];
        }
        System.out.println(ans);
    }

}
