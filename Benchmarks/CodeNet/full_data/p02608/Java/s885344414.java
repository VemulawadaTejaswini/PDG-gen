

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main
{	
	public static void main(String args[]) throws IOException
	{
		FastScanner fs = new FastScanner();
			int N = fs.nextInt(),count[] = new int[10000];
			for(int i=1; i<=100; i++)
			{
				for(int j=1; j<=100; j++)
				{
					for(int k=1; k<=100; k++)
					{
						int n =i*i+j*j+k*k+i*j+j*k+k*i;
						if(n<=10000)
						count[n-1]++;
					}
				}
					
			}
			for(int i=0; i<N; i++)
			System.out.println(count[i]);
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



	