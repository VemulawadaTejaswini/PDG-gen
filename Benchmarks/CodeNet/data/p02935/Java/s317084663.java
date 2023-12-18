import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] v = new long[N];
        for(int i= 0;i<N;i++){
            v[i] = sc.nextLong();
        }
        Arrays.sort(v);
        double ans = v[0];
        for(int i= 1;i<N;i++){
            ans = (ans+v[i])/2;
        }
        System.out.println(ans);
    }

}
