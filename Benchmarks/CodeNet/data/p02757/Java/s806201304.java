import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int ln = Integer.parseInt(sc.next());
        int P = Integer.parseInt(sc.next());
        String s = sc.next();
        int[] nums = new int[ln];
        for(int i=0; i<ln; i++){
            nums[i] = s.charAt(i)-48;
        }
        
        int count=0;
        /*for(int i=0; i<ln; i++){
            memo=nums[i];
            memo%=P;
            if(memo%P==0) count++;
            for(int j=i+1; j<ln; j++){
                memo*=10;
                memo+=nums[j];
                memo%=P;
                if(memo==0) count++;
            }
        }*/
        
        int[] re_pow10_byP = new int[ln];
        re_pow10_byP[ln-1] = 1;
        for(int i=ln-2; i >= 0; i--){
            re_pow10_byP[i] = (re_pow10_byP[i+1]*10)%P;
            //System.out.println(re_pow10_byP[i]);
        }
        
        
        int[] memo = new int[ln];
        for(int i=0; i<ln; i++){
            memo[i]=nums[i]*re_pow10_byP[i];
            memo[i]%=P;
            //System.out.println(memo[i]);
        }
        int sum=0;
        for(int i=0; i<ln; i++){
            sum=memo[i];
            if(sum==0) count++;
            for(int j=i+1; j<ln;j++){
                sum+=memo[j];
                //System.out.println(sum);
                if(sum==0) count++;
                if(sum==P){
                    count++;
                    sum-=P;
                }
            }
        }
        
        System.out.println(count);
    }
}