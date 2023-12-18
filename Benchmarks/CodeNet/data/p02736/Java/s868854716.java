import java.util.*;
import java.math.BigInteger;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    public static final int MAX = (int)1e5*5;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        
        BigInteger bit = BigInteger.ZERO;
        BigInteger tmp,c;
        BigInteger mask = BigInteger.ONE;
        for(int i=0; i<n; i++){
            bit = bit.shiftLeft(2);
            int a = Integer.parseInt(s[i]+"");
            tmp = new BigInteger(a+"");
            bit = bit.or(tmp);
            mask = mask.shiftLeft(2);
            mask = mask.or(BigInteger.ONE);
        }
        
        for(int i=0; i<n-1; i++){
            tmp = bit.xor(bit.shiftRight(2));
            c = mask.and(tmp.and(tmp.shiftLeft(1)).shiftRight(1));
            //System.out.println(tmp.toString(4));
            //System.out.println(c.toString(4));
            bit = tmp.xor(c.shiftLeft(1));
            //System.out.println(bit.toString(4));
        }
        
        String ans = bit.toString(4);
        System.out.println(ans.substring(ans.length()-1,ans.length()));
    }
}
