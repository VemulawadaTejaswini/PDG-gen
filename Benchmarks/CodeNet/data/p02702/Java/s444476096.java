import java.util.*;
import java.math.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		long n = 0;
		final BigInteger MOD = BigInteger.valueOf(2019);
		for(int i = 0; i < s.length(); i++)
			for(int j = i + 4; j <= s.length(); j++)
				if(new BigInteger(s.substring(i, j)).mod(MOD).shortValue() == 0)
					n++;
		
		System.out.println(n);
		
		sc.close();
    }
}