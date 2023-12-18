import java.util.*;

class Main {
    // 150d
    static final long MOD = 1_000_000_007;
    static final int MAX = 2000000000;
    static final int INF = 100000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = n - m;
        if(n == m){
            ans = modfact(n) * modfact(m) * 2 % MOD ;
        } else if(n-1 == m||n+1 == m){
            ans = modfact(n) * modfact(m) % MOD;
        } else{
            ans = 0;
        }

        System.out.println(ans);

    }

    static long modfact(long i) {
        long ans = 1;
        for(long j = i;j > 0;j--){
            ans = ans * j % MOD;
        }
        return ans;
    }

}
