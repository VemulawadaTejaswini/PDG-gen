
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = K-i; j <= N; j+=K) {
                if(j<=0){
                    continue;
                }
                if((i+j)%K==0&&i%K==j%K){
                    ans+=Math.min((i+N)/K-i/K, (j+N)/K-j/K);
                }
            }
        }
        System.out.println(ans);
    }
}
