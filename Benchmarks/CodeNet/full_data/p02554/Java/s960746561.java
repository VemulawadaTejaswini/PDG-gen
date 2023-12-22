import java.io.*;
import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])throws IOException
	{
		FastReader scn = new FastReader();
		long N = scn.nextLong();
		long M = 1000000007L;

		long a = getPowerModulo(10, N, M);
		long b = getPowerModulo(8, N, M);
		long c = getPowerModulo(9, N, M);

		long ans = (a + b - 2*c)%M;
		if(ans < 0)
			ans = ans + M;

		System.out.println(ans);
	}

	public static long getPowerModulo(long a, long p, long m)
    {   
        if(p==0)
            return 1;
 
        long temp = getPowerModulo(a, p/2, m);
        temp = (temp * temp)%m;
        if(p%2 == 0)
            return temp;
        else
            return (a * temp)%m;
 
    }
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
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
}