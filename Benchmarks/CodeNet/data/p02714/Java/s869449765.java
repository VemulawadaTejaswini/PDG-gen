import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        List<Integer> r = new ArrayList<Integer>();
        List<Integer> g = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        for(int i = 0;i < n;i++){
            if(str[i]=='R')r.add(i);
            if(str[i]=='G')g.add(i);
            if(str[i]=='B')b.add(i);
        }
        long ans = r.size()*b.size()*g.size();
        for(int i = 0;i < r.size();i++){
            int rn = r.get(i);
            for(int j = 0;j < g.size();j++){
                int gn = g.get(j);
                for(int k = 0;k < b.size();k++){
                    int bn = b.get(k);
                    if(rn*2==gn+bn||bn*2==gn+rn||gn*2==rn+bn){
                        ans--;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    
}
