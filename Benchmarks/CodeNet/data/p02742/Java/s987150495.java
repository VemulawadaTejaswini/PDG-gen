import java.util.*;
import java.math.BigInteger;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        BigInteger ans = BigInteger.ZERO;
        BigInteger h = BigInteger.valueOf(H);
        BigInteger w = BigInteger.valueOf(W);
        
        if(H % 2 == 0){
          BigInteger m = h.divide(BigInteger.valueOf(2));
          ans = m.multiply(w);
          System.out.println(ans);
        }else{
          BigInteger one = h.divide(BigInteger.valueOf(2)).add(BigInteger.valueOf(1));
          BigInteger two = h.divide(BigInteger.valueOf(2));
          for(int i = 0; i < W; i++){
            if(i % 2 == 0){
              ans = ans.add(one);
            }else{
              ans = ans.add(two);
            }
          }
          
           System.out.println(ans);
        }  
	}

}