import java.util.Scanner;

public class Main 
{
	
	static long gcd(long a, long b) 
	{ 
	    if (a == 0) 
	        return b; 
	    return gcd(b % a, a); 
	} 
	
	static int n;
	static long[] a, fl, fr;
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new long[n];
		fl = new long[n];
		fr = new long[n];
		
		long curg = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			curg = gcd(curg,a[i]);
			fl[i] = curg;
		}
		
		curg = 0;
		for(int i = n-1; i >= 0; i--)
		{
			curg = gcd(curg,a[i]);
			fr[i] = curg;
		}
		
		long max = 0;
		for(int i = 0; i < n; i++)
		{
			long l = 0;
			long r = 0;
			if(i > 0)l = fl[i-1];
			if(i < n-1)r = fr[i+1];
			max = Math.max(max, gcd(l,r));
//			System.out.println("i " + i + ", l: " + l + ", r: " + r + ", curg " + gcd(l,r));
		}
		System.out.println(max);

	}

}
