import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		while((s=br.readLine())!=null)
		{
		    int n = Integer.valueOf(s);
  		    System.out.println(numOfPrimes(n));
		}
	}
	
	private static int numOfPrimes(int n)
	{
		if(n<2) return 0;
		int i = 2, count=0;
		while(i <= n)
		{
		    if(isPrime(i)) 
			count++;
			i++;
		}
		return count;
	}

	private static boolean isPrime(int p)
	{
		if(p==2) return true;
		for(int i=2; i*i<=p; i++)
			if(p%i==0) return false;
		return true;
	}
}