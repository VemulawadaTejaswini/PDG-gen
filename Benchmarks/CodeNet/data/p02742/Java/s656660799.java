import java.util.*;
import java.math.BigInteger;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        BigInteger ans = BigInteger.ZERO;
        BigInteger h = BigInteger.valueOf(H);
        BigInteger w = BigInteger.valueOf(W);
        
        if(H == 1 || W == 1){
          System.out.println(1);
        }else if(H % 2 == 0){
          ans = h.multiply(w).divide(BigInteger.valueOf(2));
          System.out.println(ans);
        }else{
          ans = h.multiply(w).divide(BigInteger.valueOf(2)).add(BigInteger.valueOf(1));
          System.out.println(ans);
        }  
	}

}