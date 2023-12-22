

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main
{	
	
	
	public static void main(String args[]) throws IOException
	{
		FastScanner fs = new FastScanner();
		
		int a = fs.nextInt(),b = fs.nextInt(),c = fs.nextInt();
		int k = fs.nextInt();
		
		while(a>=b)
		{
			b *= 2;
			k--;
		}
		while(b>=c)
		{
			c *= 2;
			k--;
		}
		System.out.println((k<0)?"No":"Yes");
			
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



	