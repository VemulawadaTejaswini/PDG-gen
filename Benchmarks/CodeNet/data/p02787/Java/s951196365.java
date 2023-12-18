import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    // no self-loop or multiple edges
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), n = sc.nextInt();
        int[] cur = new int[H+1], next = new int[H+1];
        Arrays.fill(cur,Integer.MAX_VALUE/2);
        cur[H] = 0;
        for(int i=0;i<n;i++){
            Arrays.fill(next,Integer.MAX_VALUE/2);
            int a = sc.nextInt(), b = sc.nextInt();
            if(a>H){
                System.arraycopy(cur, 0, next, 0, H+1);
                next[0] = Math.min(next[0], b);
            } else{
                for(int j=H; j>H-a; j--) next[j] = cur[j];
                for(int j=H-a;j>0;j--){
                    next[j] = Math.min(next[j+a]+b,Math.min(cur[j],cur[j+a]+b));
                }
                next[0] = cur[0];
                for(int j=a;j>=0;j--){
                    next[0] = Math.min(next[0],Math.min(cur[j]+b,next[j]+b));
                }
            }
            System.arraycopy(next, 0, cur, 0, H+1);
        }
        long ans = cur[0];
        sc.close();
        return ans;
    }
}

