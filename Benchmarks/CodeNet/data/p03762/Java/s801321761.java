import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        long xtotal = 0;
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            xtotal += (i * x) - ((n-i-1) * x);
            xtotal %= mod;
        }
        long ytotal = 0;
        for(int i = 0; i < m; i++){
            long y = sc.nextLong();
            ytotal += (i * y) - ((m-i-1) * y);
            ytotal %= mod;
        }
        System.out.println((xtotal*ytotal)%mod);
    }
}
