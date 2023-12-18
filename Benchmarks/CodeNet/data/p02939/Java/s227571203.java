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
		ProblemB solver = new ProblemB();
		solver.solve(1, in, out);
		
		out.close();
	}
	
	static class ProblemB
	{
		void solve(int TestCase, InputReader in, PrintWriter out)
		{
			String s = in.next();
			int res = 0;
			String prev = "";
			for(int i = 0; i < s.length(); )
			{
				int len = 1;
				if(s.substring(i, i + len).equals(prev))
					len++;
				if(i + len > s.length())
					break;
				
				prev = s.substring(i, i + len);
				i += len;
				res++;
			}
			
			out.println(res);
		}
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
		
		public long nextLong()
		{
			return Long.parseLong(next());
		}
	}
}