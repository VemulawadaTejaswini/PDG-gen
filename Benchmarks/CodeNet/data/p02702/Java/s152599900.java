import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
      	int len = S.length();
      	int count = 0;
        BigInteger divisor = new BigInteger("2019");
      	for(int i=0;i<=len-4;i++){
          for(int j=i+4;j<=len;j++){
            BigInteger target = new BigInteger(S.substring(i,j));
            if(target.remainder(divisor) == BigInteger.ZERO) count++;
          }
        }
		System.out.println(count);
	}
}