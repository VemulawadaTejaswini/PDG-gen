import java.util.*;
public class Main {
	
	public static long c(int n , int r)
	{
		if(r>n/2) return c(n,n-r);
		long x =1;
		for(int i = 0 ;i<r;i++)
			x*= n-i;
		for(int i = 0 ;i<r;i++)
			x/= r-i;
		return x;
	}
	public static long p (int n ,int r)
	{long x =1;
	for(int i = 0 ;i<r;i++)
		x*= n-i;
	return x;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		int r =n-k;
		for(int i=1;i<=k;i++)
		{		
			int pl = r+1;
			long pll = c(pl,i);	
			long prt = c(k-1,i-1);
			//System.out.println(pll);
			//System.out.println(prt);
			System.out.println((pll*prt)%1000000007);			
			
		}

	}

}
