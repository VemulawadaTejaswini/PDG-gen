import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    boolean[] prime = new boolean[1000000000];
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long ans=0;
        for(int i=2;i<=M;i++){
            if(M%i==0&&M/i>=N){
                ans=i;
            }
            if(M/i<=N){
                break;
            }
        }
        System.out.println(ans);
    }

    void sieve(int n) {
        int p = 0;
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        prime[0] = prime[1] = false;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}