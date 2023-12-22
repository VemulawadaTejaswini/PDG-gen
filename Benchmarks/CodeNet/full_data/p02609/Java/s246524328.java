import java.util.*;
import java.math.BigInteger;

public class Main{
    
    static final int MOD = (int)1e9+7;
    static HashMap<Integer, Integer> memo;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        BigInteger x = new BigInteger(s, 2);
        BigInteger sh = BigInteger.ONE;
        BigInteger xor;
        int popcount = x.bitCount();
        
        memo = new HashMap<>();
        
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            xor = x.xor(sh);
            if(!isZero(xor)){
                if(isZero(x.and(sh))){
                    ans[i] = calc(xor, popcount+1);
                }else{
                    ans[i] = calc(xor, popcount-1);
                }
            }
            sh = sh.shiftLeft(1);
        }
        
        for(int i=n-1; i>=0; i--){
            System.out.println(ans[i]);
        }
    }
    
    public static int calc(BigInteger x, int popcount){
        if(memo.containsKey(x.hashCode())){
            return memo.get(x.hashCode());
        }
        BigInteger rem = new BigInteger("" + popcount);
        BigInteger y = x.remainder(rem);
        if(isZero(y)){
            return 1;
        }
        int res = calc(y, y.bitCount())+1;
        if(!memo.containsKey(x.hashCode())){
            memo.put(x.hashCode(), res);
        }
        return res;
    }
    
    public static boolean isZero(BigInteger x){
        return BigInteger.ZERO.equals(x);
    }
}
