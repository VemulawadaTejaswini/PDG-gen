import java.util.*;
import java.math.BigInteger;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        BigInteger x = new BigInteger(s, 2);
        BigInteger sh = BigInteger.ONE;
        BigInteger xor;
        
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            xor = x.xor(sh);
            int popcount = xor.bitCount();
            if(!isZero(xor)){
                ans[i] = calc(xor, popcount, 1);
            }
            sh = sh.shiftLeft(1);
        }
        
        for(int i=n-1; i>=0; i--){
            System.out.println(ans[i]);
        }
    }
    
    public static int calc(BigInteger x, int popcount, int i){
        BigInteger rem = new BigInteger("" + popcount);
        x = x.remainder(rem);
        if(isZero(x)){
            return i;
        }
        return calc(x, x.bitCount(), i+1);
    }
    
    public static boolean isZero(BigInteger x){
        return BigInteger.ZERO.equals(x);
    }
}
