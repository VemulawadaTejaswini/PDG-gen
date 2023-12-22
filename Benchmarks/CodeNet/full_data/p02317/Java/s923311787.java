import java.util.Arrays;
import java.util.Scanner;

//155
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n], dp[] = new int[n], res = 1;
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 0; j <= i;j++) {
                if (j==0||dp[j-1] < a[i]) {
                    dp[j] = Math.min(dp[j], a[i]);
                    res=Math.max(res, j+1);
                }
            }
        }
        System.out.println(res);
    }
}
