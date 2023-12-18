import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    long[] frac, inv;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    long solve() throws IOException {
        int n = sc.nextInt();
        long[] a = new long[n];
        long maxi = 0;
        for(int i=0;i<n;i++) {
            a[i]= sc.nextLong();
            maxi = Math.max(maxi, a[i]);
        }
        if(maxi==0) return 0;
        long odd_rec = 0;
        for(int i=60; i>=0;i--){
            int cnt = 0;
            long mask = 1L<<i;
            for(long num:a){
                if((num&mask)>0) cnt++;
            }
            if(cnt%2==1) odd_rec |= mask;
        }
        long antimask = ~odd_rec;
        for(int i=0;i<n;i++) a[i]&=antimask;
        // only the bits where even_number of 1's are kept
        TreeSet<Long> set = new TreeSet<>(Collections.reverseOrder());
        long[] line_base = new long[61];
        for(long c:a){
            long backup = c;
            for(int i=60;i>=0;i--){
                long mask = 1L<<i;
                if((mask&backup)==0) continue;
                if(line_base[i]==0){
                    line_base[i] = backup;
                    set.add(backup);
                    break;
                } else{
                    backup ^= line_base[i];
                }
            }
        }
        long ans = 0;
        for(long b:set){
            if((ans^b) > ans) ans = ans^b;
        }
        return 2*ans+odd_rec;
    }
}