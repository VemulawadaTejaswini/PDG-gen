import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();
        long[] x = new long[N + 1];
        long[] x1=new long[N+1];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        x[N] = X;
        Arrays.sort(x);
        long ans = INF;
        for (int i = 1; i <= N; i++) {
            ans = Math.min(Math.abs(x[i] - x[i - 1]), ans);
        }
        for (int i = 1; i <=N; i++) {
            x1[i] = x[i] - x[i - 1];
        }
        for (int i = 2; i <= N; i++) {
            ans=(long)Math.min(gcd(x1[i],x1[i-1]),ans);
        }
        System.out.println(ans);
    }

    long gcd(long m, long n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
    
}
