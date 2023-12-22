import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    long inv2 =1;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    long solve() throws IOException {
        int n = sc.nextInt();
        long[] a = new long[n+1];
        for(int i=0; i<=n; i++) a[i] = sc.nextLong();
//        if(a[0]>0) return -1;
        long[] mini = new long[n+1], maxi = new long[n+1];
        mini[n] = a[n]; maxi[n] = a[n];
        for(int i=n-1; i>=0; i--){
            mini[i] = (mini[i+1]+1)/2;
            mini[i] += a[i]; maxi[i] = maxi[i+1]+a[i];
        }
        if(mini[0]!=1) return -1;
        long cur = 1, ans = 1;
        for(int i=1; i<=n; i++){
            cur = Math.min(cur*2, maxi[i]);
            ans += cur;
            cur -= a[i];
        }
        return ans;
    }
}