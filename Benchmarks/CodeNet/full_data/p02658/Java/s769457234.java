import java.io.*;
import java.util.*;
public class Main
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        Reader sc=new Reader();
        int n=sc.nextInt();
        long p=1l;
        boolean exceed=false;
        for(int x=0;x<n;x++)
        {
            p=(long)((long)p*sc.nextLong());
            if(p>1000_000_000_000_000_000l)
            {
                exceed=true;
            }
        }
        if((p<0||exceed)&&p!=0)
        {
            p=-1;
        }
        out.println(p);
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
