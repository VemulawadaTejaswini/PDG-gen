import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.ThreadLocalRandom;
public class Main 
{
	
	static long gcd(long a, long b) 
	{
		if (b == 0)
		{	
			return a;
		}
		
		else
		{
			 return gcd(b, a % b);
		}
	}
	public static void main(String[] args) throws Exception
	{

		
		   PrintWriter out = new PrintWriter(System.out);
		   Scanner in = new Scanner(System.in);
		 // long n , k , q;
		  
	int k = in.nextInt();
	  int s = in.nextInt();
	  long cnt = 0;
	for(int a = 0; a <= k; a++)
		for(int b = 0; b <= k ; b++)
			for(int c = 0; c <= k ; c++)
				if(a + b + c == s) cnt++;
	out.println(cnt);
	   out.close();
	}
}