import java.util.*;

class Main {
    //
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("0");
            return;
        }
        if(n==1){
            System.out.println("1");
            return;
        }
        int max = 0;
        long[] sum = new long[n];
        sum[0] = 0;
        for(int i = 1;i < n;i++){
            sum[i] = i + sum[i-1];
        }
        while(n > 0){
            for(int i = 0;i <= n;i++){
                if(max == 0&&sum[i] >= n){
                    max = i;
                    break;
                }
            }
            if(max == 0)break;
            System.out.println(max);
            n -= max;
            max = 0;
        }
    }
}