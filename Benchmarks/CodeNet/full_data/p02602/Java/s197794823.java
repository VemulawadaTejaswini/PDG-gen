
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
		int k = fs.nextInt();
		int arr[] = fs.arrayIn(n),i=0;
		while (i<k) i++;
		
		for(; i<n; i++)
		{
			if(arr[i-k] < arr[i])
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
			
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



	