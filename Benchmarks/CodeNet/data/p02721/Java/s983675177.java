import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] size; // size of subtree, including self
    List<Integer>[] graph;
    long[] dp,ans;
    final long mod = 1000000000+7;
    long[] frac,inv; // inv[i] = the inversion of i! mod M
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        out.flush();
//        System.out.println(main.solve());
    }
    long solve() throws IOException{
        int n = sc.nextInt(), k = sc.nextInt(), c = sc.nextInt();
        int[] prev = new int[n], suf = new int[n];
        char[] s = sc.next().toCharArray();
        if(c==0){
            int cnt = 0;
            for(char cha:s) cnt += cha=='o'?1:0;
            if(cnt==k){
                for(int i=0;i<n;i++){
                    if(s[i]=='o') out.println(i+1);
                }
            }
            return 0;
        }
        int tempc = c;
        // calculate prev
        prev[0] = s[0]=='o'?1:0;
        for(int i=1;i<n;i++){
            if(s[i]=='o'){
                if(i-tempc-1<0) prev[i] = 1;
                else prev[i] = Math.max(prev[i-1],prev[i-tempc-1]+1);
            } else{
                prev[i] = prev[i-1];
            }
        }
        // calculate suf
        suf[n-1] = s[n-1]=='o'?1:0;
        for(int i=n-2;i>=0;i--){
            if(s[i]=='o'){
                if(i+tempc+1>=n) suf[i] = 1;
                else suf[i]= Math.max(suf[i+1],1+suf[i+tempc+1]);
            } else{
                suf[i] = suf[i+1];
            }
        }
        // finally answer
        TreeSet<Integer> start = new TreeSet<>();
        for(int left = -c;left <n;left++){
            int front = left>=0?prev[left]:0;
            int back = left+c+1<n?suf[left+c+1]:0;
            if(front+back>=k) start.add(left);
        }
        for(int i=0;i<n;i++){
            if(s[i]=='x') continue;
            Integer key = start.lower(i);
            if(key==null || key+c<i) out.println(i+1);
        }
        return 0;
    }
}

