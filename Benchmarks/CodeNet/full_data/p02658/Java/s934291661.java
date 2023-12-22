import java.util.*;
import java.math.BigInteger; 
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigInteger ans=new BigInteger("1");
        for (int i=0;i<N;i++){
            int k=in.nextInt();
            BigInteger x=new BigInteger("1");
            x=BigInteger.valueOf(k);
            ans=ans.multiply(x);
        }
        BigInteger y=new BigInteger("1000000000000000000");
        if(ans.compareTo(y)>0)
        {
            System.out.println("-1");
        }
        else 
        {
            System.out.println(ans);
        }
    }
}
