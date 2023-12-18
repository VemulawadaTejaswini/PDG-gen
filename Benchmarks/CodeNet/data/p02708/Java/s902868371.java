import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int ans = 0;

        for(int i=k; i<=n+1;i++) {
            int min = sum(i-1);
            int max = sum(n) - sum(n-i);
            int sa = max - min;
            sa++;
            ans = (ans + sa) % mod;
        }
        System.out.println(ans);
    }
    public static int sum(int n) {
        int ans = n*(n+1)/2;
        //累積和
        return ans;
    }
}
