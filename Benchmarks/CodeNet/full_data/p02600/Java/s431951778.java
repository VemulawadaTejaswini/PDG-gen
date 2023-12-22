
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main
{	
	
	
	public static void main(String args[]) throws IOException
	{
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
    	  long balance = 1000,stocks=0;
		int arr[] = fs.arrayIn(n);

		for(int i=1; i<n; i++)
		{
				while (i<n && arr[i-1]>=arr[i]) i++;
				
				if(i < n)
				{
					stocks = balance/arr[i-1];
					balance = balance%arr[i-1];
				}
				i++;
				while(i<n && arr[i-1]<= arr[i]) i++;
				if(i < n)
				{
					balance += stocks*arr[i-1];
					stocks = 0;
				}
				
		}
		if(balance < 1000)
		{
			balance += stocks*arr[n-1];
			stocks = 0;
		}
		System.out.println(balance);
		
			
	}


	
}
class FastScanner
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer str = new StringTokenizer("");
	
	String next() throws IOException
	{
		while(!str.hasMoreTokens())
			str = new StringTokenizer(br.readLine());
		
		return str.nextToken();
	}
	
	int nextInt() throws IOException
	{
		return Integer.parseInt(next());
	}
	
	float nextfloat() throws IOException
	{
		return Float.parseFloat(next());
	}
	
	double nextDouble() throws IOException
	{
		return Double.parseDouble(next());
	}
	long nextLong() throws IOException
	{
		return Long.parseLong(next());
	}
	int[] arrayIn(int n) throws IOException
	{
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = nextInt();
		}
		return arr;
	}
}



	