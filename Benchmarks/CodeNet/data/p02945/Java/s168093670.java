import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		out.println(Math.max(a + b, Math.max(a - b, a * b)));
		
		out.close();
	}
	
	static class InputReader
	{
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		
		public InputReader(InputStream stream)
		{
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
		
		public String next()
		{
			while(tokenizer == null || !tokenizer.hasMoreTokens())
			{
				try
				{
					tokenizer = new StringTokenizer(reader.readLine());
				}
				catch(IOException e)
				{
					throw new RuntimeException(e);
				}
			}
			
			return tokenizer.nextToken();
		}
		
		public int nextInt()
		{
			return Integer.parseInt(next());
		}
	}
}