import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
     
    public static final int MAX = 1000;
     
    public static final int[] coins = new int[]{500, 100, 50, 10, 5, 1};
    public static final int[] maxs  = new int[]{
		Integer.MAX_VALUE,
		Integer.MAX_VALUE,
		Integer.MAX_VALUE,
		Integer.MAX_VALUE,
		Integer.MAX_VALUE,
		Integer.MAX_VALUE
    };
    
    public static final int ret_coin(int P, int[] coin_nums){
        int ret = 0;
         
        for(int i = 0; i < coins.length; i++){
            final int p_use = P / coins[i];
            final int can_use = Math.min(p_use, coin_nums[i]);
            
            ret += can_use;
            
            P -= coins[i] * can_use;
        }
         
        return ret;
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(true){
            final int P = sc.nextInt();
             
            if(P == 0){
                break;
            }
             
            int[] coin_nums = new int[6];
            int sum = 0;
            for(int i = 0; i < 6; i++){
                coin_nums[5 - i] = sc.nextInt();
                sum += coin_nums[5 - i] * coins[5 - i];
            }
             
            final int max = Math.min(sum, P + 500);
            
            int min = Integer.MAX_VALUE;
            for(int i = P; i <= max; i++){
            	//System.out.println((i - P) + " " + ret_coin(i - P, maxs));
            	min = Math.min(min, ret_coin(i, coin_nums) + ret_coin(i - P, maxs));
            }
            
            System.out.println(min);
            
        }
         
        sc.close();
    }
}