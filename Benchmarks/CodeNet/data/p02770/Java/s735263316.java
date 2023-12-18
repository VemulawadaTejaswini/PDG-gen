import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int k;
    long[] d;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException{
        k = sc.nextInt(); int q = sc.nextInt();
        d = new long[k];
        for(int i=0;i<k;i++) d[i] = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt(), x = sc.nextInt(), m = sc.nextInt();
            long ans = helper(n,x,m);
            out.println(ans);
        }
        out.flush();
    }
    long helper(long n, long x, long m){
        long[] tempD = new long[k];
        for(int i=0;i<k;i++) tempD[i] = d[i]%m;
        long res = 0;
        // firstly count the "=" case
        for(int j=0;j<k;j++){
            if(tempD[j]!=0) continue;
            long cur = (n-1)/k;
            cur += (n-1)%k>j?1:0;
            res += cur;
        }
        // then count the ">" case
        // compute a[n-1]
        long time = (n-1)/k, r = (n-1)%k;
        long sumD = 0;
        for(long num:tempD) sumD += num;
        // end = a[n-1]
        long end = x + time*sumD;
        for(int i=0;i<r;i++) end += tempD[i];
        long diff = end/m-x/m;
        res += diff;
        return n-1-res;
    }
}

