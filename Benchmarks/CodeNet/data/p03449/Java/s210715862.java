import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sumA += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            sumB += b[i];
        }
        int[] ans = new int[n];
        ans[0] = sumB + a[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] - b[i - 1] + a[i];
        }
        Arrays.sort(ans);
        System.out.println(ans[n - 1]);
    }
}
