import java.util.*;

class Main {
    // ABC152D
    static final long MOD = 1_000_000_007;
    // 10^9+7
    //static final int MAX = 2_147_483_646;
    static final int MAX = 10_000_000;
    // intの最大値
    static final int INF = 1_000_000_000;
    // 10^9

  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ary[] = new double[n];
        int tmp = 0;
        for(int i = 0;i < n;i++){
            tmp = sc.nextInt();
            ary[i] = (double)(tmp+1)/2;
        }
        double ans = 0;
        double poyo = 0;
        for(int j = 0;j < k;j++){
            poyo += ary[j];
        }
        ans = poyo;
        for(int i = k;i < n;i++){
            poyo +=ary[i] - ary[i-k];
            if(ans < poyo)ans = poyo; 
        }
        System.out.println(ans);
    }
    
}


