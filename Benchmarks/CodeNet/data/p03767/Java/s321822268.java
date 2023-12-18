import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[3*N];
        for (int i = 0; i < 3*N; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long ans=0;
        int n=3*N-2;
        for(int i=0;i<N;i++){
              ans+=a[n];
              n=n-2;
        }
       System.out.println(ans);
    }
}
