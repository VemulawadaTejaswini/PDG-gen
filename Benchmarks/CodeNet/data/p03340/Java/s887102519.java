import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] sum = new int[n+1];
        int[] xor = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            a[i] = x;
            sum[i] += x + sum[i-1];
            xor[i] = x ^ xor[i-1];
        }
        long ans = 0;
        int r = 1;
        for (int i = 0; i < n; i++) {
            while(r <= n && (sum[r] - sum[i]) == (xor[r] ^ xor[i])){
                r++;
            }
            ans += r - i - 1;
        }
        System.out.println(ans);
        sc.close();
    }

}
