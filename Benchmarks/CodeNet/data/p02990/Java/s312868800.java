import java.math.BigInteger;
import java.util.*;
public class Main {
	static long mod = 1000000007;
	public static BigInteger c(int n , int r)
	{
		if(r>n/2) r = n-r;
		BigInteger x = BigInteger.ONE;
		for(int i = 1 ;i<=r;i++)
			x = x.multiply(BigInteger.valueOf(n-r+i)).divide(BigInteger.valueOf(i));
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		int r =n-k;
		
		for(int i=1;i<=k;i++)
		{		
			
			BigInteger pll = c(r+1,i);	
			BigInteger prt = c(k-1,i-1);
			
			//System.out.println(pll);
			//System.out.println(prt);
			System.out.println((pll.multiply(prt)).mod(BigInteger.valueOf(mod)));			
			
		}

	}

}
