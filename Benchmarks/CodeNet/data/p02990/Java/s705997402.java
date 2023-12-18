import java.math.BigDecimal;
import java.util.*;

class Main{
    static int mod = (int)Math.pow(10, 9)+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ballNum = sc.nextInt();
        int blueNum = sc.nextInt();
        int redNum = ballNum - blueNum;

        for(int i = 0; i < blueNum; i++){
            int ans = modTimes(modPow(i+1, blueNum-i-1), combination(redNum+1, i+1));
            System.out.println(ans);
        }
    }

    static int combination(int sum, int select){
        int ans = 1;
        for(int i = sum; i > sum-select; i--){
            ans = modTimes(ans, i);
        }
        for(int i = 1; i <= select; i++){
            ans = modDiv(ans, i);
        }
        return ans;
    }

    static int modDiv(int a, int b){
        int ans = modTimes(a, modPow(b, mod-2));
        return ans;
    }
    static int modTimes(int a, int b){
        BigDecimal ans = BigDecimal.ONE;
        ans = ans.multiply(BigDecimal.valueOf(a));
        ans = ans.multiply(BigDecimal.valueOf(b));
        ans = ans.remainder(BigDecimal.valueOf(mod));
        return ans.intValue();
    }

    static int modPow(int a, int b){     
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a % mod;
        }    
        if(b % 2 == 0){
            BigDecimal ans = BigDecimal.valueOf(modPow(a, b/2)).pow(2).remainder(BigDecimal.valueOf(mod));
            return ans.intValue();
        }
        BigDecimal ans = BigDecimal.valueOf(modPow(a, b-1)).multiply(BigDecimal.valueOf(a)).remainder(BigDecimal.valueOf(mod));
        return ans.intValue();
    }
}