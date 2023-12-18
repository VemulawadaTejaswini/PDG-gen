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



public class Solution
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


    public static void main(String[] args)
    {
        OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
       
        
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
        	a[i] = sc.nextInt();
        }
        
        int map[] = new int[n];
        
        for(int i = 0; i < m; i++)
        {
        	int x = sc.nextInt()-1;
        	int y = sc.nextInt()-1;
        	
        	if(a[x] > a[y])
        	{
        		map[y] = -1;
        	}
        	else if(a[x] < a[y])
        	{
        		map[x] = -1;
        	}
        	else
        	{
        		map[x] = -1;
        		map[y] = -1;
        	}
        }
        
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
        	if(map[i] == 0) cnt++;
        }
        
        out.println(cnt);
        out.close();
    }

}