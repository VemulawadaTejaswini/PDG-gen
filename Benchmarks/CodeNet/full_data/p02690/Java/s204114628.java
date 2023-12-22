import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



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
                catch (IOException e)
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

    static int gcd(int a,int b)
	{
		if(a == 0) return b;
		if(b == 0) return a;
		
		return gcd(b,a%b);
	}
    
    static long p5[] = new long[2001];
    
    static void pC()
    {	
    	int base = -1000;
    	for(int i = 0; i < 2001; i++)
    	{
    		p5[i] = (long)Math.pow(base,5);
    		base++;
    	}
    	//System.out.println(p5[128]+" "+p5[0]);
    }
    
    public static void main(String[] args)
    {
        OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
       
        pC();
        
        long x = sc.nextLong();
        
        int a = 0;
        int b = 0;
        
        outer: for(int i = 0; i < 2001; i++)
        {
        	for(int j = i+1; j < 2001; j++)
        	{
        		long val2 = p5[j]-p5[i];
        		
        		
        		if(val2 == x)
        		{
        			a = j-1000;
        			b = i-1000;
        			break outer;
        		}
        	}
        }
        
        out.println(a+" "+b);
        out.close();
    }

}