import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        long[] x = new long[N + 1];
        for (int i = 0; i <N; i++) {
            x[i] = sc.nextInt();
        }
        x[N]=X;
        Arrays.sort(x);
        long ans = INF;
        for (int i = 1; i <= N; i++) {
            ans = Math.min(Math.abs(x[i] - x[i - 1]), ans);
        }
        for(int i=1;i<=N;i++){
            if(Math.abs(x[i] - x[i - 1])%ans!=0){
                ans=1;
            }
        }
        System.out.println(ans);

    }
}