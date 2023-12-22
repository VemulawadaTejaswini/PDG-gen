import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
     
    public static final int MAX = 1000;
     
    public static final int[] coins = new int[]{1, 5, 10, 50, 100, 500};
     
    public static final int ret_coin(int P){
        int ret = 0;
         
        for(int i = coins.length - 1; i >= 0; i--){
            final int t = P / coins[i];
             
            ret += t;
             
            P -= t * coins[i];
        }
         
        return ret;
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int DP_MAX = 0;
        for(int coin : coins){
            DP_MAX += coin * MAX;
        }
         
        int[] DP = new int[DP_MAX + 1];
         
        while(true){
            final int P = sc.nextInt();
             
            if(P == 0){
                break;
            }
             
            Arrays.fill(DP, Integer.MIN_VALUE);
            DP[0] = 0;
            
            int p_max = 0;
            int c_max = P + 500;
            
            int[] coin_nums = new int[6];
            for(int i = 0; i < 6; i++){
                coin_nums[i] = sc.nextInt();
                p_max += coin_nums[i] * coins[i];
            }
            
            int cur_max = Math.min(p_max, c_max);
             
            for(int coin_type = 0; coin_type < 6; coin_type++){
                for(int target = cur_max; target >= 0; target--){
                    if(DP[target] < 0){
                        continue;
                    }
                     
                    for(int coin = 1; coin <= coin_nums[coin_type]; coin++){
                        final int next = target + coins[coin_type] * coin;
                         
                        if(next > DP_MAX){
                            break;
                        }
                         
                        if(DP[next] < 0 || DP[next] > DP[target] + coin){
                            DP[next] = DP[target] + coin;
                        }
                    }
                }
            }
             
            int min = Integer.MAX_VALUE;
            for(int i = P; i <= cur_max; i++){
                if(DP[i] >= 0 && DP[i - P] >= 0){
                    min = Math.min(min, DP[i] + ret_coin(i - P));
                }
            }
             
            System.out.println(min);
        }
         
        sc.close();
    }
}