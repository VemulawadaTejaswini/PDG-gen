import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a= new long[N+1];
        long[] b= new long[N+1];
        for(int i = 1;i<=N;i++){
            a[i] = sc.nextInt();
        }
        int all = 0;
        int count =0;
        for(int i = N;1 <= i;i--){
            all = 0;
            for(int j = 1;i*j<N;j++){
                all += b[i*j];
            }
            if(all%2==0&&a[i]==1){
                b[i] = 1;
                count++;
            }else if(all%2==1&&a[i]==0){
                b[i] = 1;
                count++;
            }
        }
        System.out.println(count);
        for(int i=1;i<=N;i++){
            if(b[i]==1)
            System.out.println(i+" ");
        }
    }
    
    int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}