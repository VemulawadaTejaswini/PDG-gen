import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();
        long ans = 0;

        BigInteger zero = new BigInteger("0");
        BigInteger target = new BigInteger("2019");
        for(int l = 0; l < n - 4; l++){
            for(int r = l + 3; r < n; r++){
                BigInteger b = new BigInteger(s.substring(l, r + 1));
                if(b.remainder(target).compareTo(zero) == 0){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
