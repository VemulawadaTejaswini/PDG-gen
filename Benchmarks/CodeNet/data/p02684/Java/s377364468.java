import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    static long[] fact = new long[100];
    
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt()-1;
        }
        boolean[] come = new boolean[n];
        int[] count = new int[n];
        int go = 0;
        int num = 0;
        while(true){
            if(come[go])break;
            come[go] = true;
            count[go] = num;
            num++;
            go = ary[go];
        }
        //System.out.println(count[go]+" "+num);
        int mod = num-count[go];
        k%=mod;
        int ans = 0;
        for(int i = 0;i < k;i++){
            ans = ary[ans];
        }
        System.out.println(ans+1);
    }
    
    
}
