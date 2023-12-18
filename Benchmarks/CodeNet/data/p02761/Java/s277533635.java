import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int maxn;
    long[] frac,inv;
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    String solve() throws IOException {
        int n = sc.nextInt(),  m = sc.nextInt();
        TreeSet<Integer>[] rec = new TreeSet[n+1];
        for(int i=0;i<=n;i++) rec[i] = new TreeSet<>();
        for(int t=0;t<m;t++){
            int s = sc.nextInt(), c = sc.nextInt();
            rec[s].add(c);
        }
        if(m==0){
            return n==1?"0":"-1";
        }
        StringBuilder sb = new StringBuilder();
        for(int d=1;d<=n;d++){
            if(rec[d].size()>1) return "-1";
            int now;
            if(rec[d].size()==0){
                now = d==1?1:0;
            } else{
                now = rec[d].first();
            }
            sb.append(now);
        }
        String ans = sb.toString();
        if(ans.length()>1&&ans.charAt(0)=='0') return "-1";
        return sb.toString();
    }
}

