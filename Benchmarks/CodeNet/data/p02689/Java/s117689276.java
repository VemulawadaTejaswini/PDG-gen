import java.io.*;
import java.util.*;
public class Main
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        Reader sc=new Reader();
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean acc[]=new boolean[n];
        int h[]=new int[n];
        for(int x=0;x<n;x++)
        {
            h[x]=sc.nextInt();
        }
        for(int x=0;x<m;x++)
        {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            if(h[a]>h[b])
            {
                acc[b]=true;
            }
            else if(h[a]<h[b])
            {
                acc[a]=true;
            }
            else
            {
                acc[a]=acc[b]=true;
            }
        }
        int c=0;
        for(int x=0;x<n;x++)
        {
            if(!acc[x])
            {
                c++;
            }
        }
        out.println(c);
        out.close();
    }

    public static void solve()
    {
    }

    static class Reader 
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next()
        {
            while(!st.hasMoreTokens())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt()
        {
            return Integer.parseInt(next());
        }

        public long nextLong()
        {
            return Long.parseLong(next());
        }

        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public String nextLine()
        {
            try
            {
                return br.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext()
        {
            String next=null;
            try
            {
                next=br.readLine();
            }
            catch(Exception e)
            {
            }
            if(next==null)
            {
                return false;
            }
            st=new StringTokenizer(next);
            return true;
        }
    } 
}