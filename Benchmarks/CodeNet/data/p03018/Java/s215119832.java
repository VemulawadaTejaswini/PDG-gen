import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
	
	static long count(String s, int start, int end)
	{
		long res = 0;
		long na = 0;
		for(int i = start; i < end; i++)
		{
			if(s.charAt(i) == 'A' )
				na++;
			else
				res += na;
		}
		
		return res;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader e = new FastReader();
		
		String s = e.next();
		s = s.replace("BC", "D");
		long res = 0;
		for(int i = 0; i < s.length(); )
		{
			if(s.charAt(i) == 'A' )
			{
				int j = i;
				while(j < s.length() && (s.charAt(j) == 'A' || s.charAt(j) == 'D') )
					j++;
				res += count(s, i, j);
				i = j;
			}
			else
			{
				i++;
			}
		}
		
		System.out.println(res);
	}
}