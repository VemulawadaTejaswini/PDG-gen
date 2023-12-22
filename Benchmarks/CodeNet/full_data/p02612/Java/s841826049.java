
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main

{	
	public static void main(String args[]) throws IOException
	{
		FastScanner fs = new FastScanner();
			int n = fs.nextInt();
			System.out.println((1000-n%1000)%1000);
		
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
	int [] arrayIn(int n) throws IOException
	{
		int  arr[] = new int[n];
		arr[0] = 0;
		for(int i=1; i<n; i++)
		{
			arr[i] = nextInt();
		}
		return arr;
	}
}



	
