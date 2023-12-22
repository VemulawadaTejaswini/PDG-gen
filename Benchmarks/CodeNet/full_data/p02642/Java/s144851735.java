import java.io.*;
import java.util.*;

public class Main
{
    static PrintWriter out = new PrintWriter((System.out));

    public static void main(String args[]) throws IOException
    {
        Kioken sc = new Kioken();
        int n=sc.nextInt();
        int ar[]=new int[n];
        HashMap<Integer,ArrayList<Integer>> set=new HashMap<>();
        int max=0;
        for(int x=0;x<n;x++)
        {
            int a=sc.nextInt();
            ar[x]=a;
            if(a>max)
            {
                max=a;
            }
            if(set.containsKey(a))
            {
                ArrayList<Integer> d=set.get(a);
                d.add(x);
                set.put(a,d);
            }
            else
            {
                ArrayList<Integer> d=new ArrayList<>();
                d.add(x);
                set.put(a,d);
            }
        }
        for(int x=0;x<n;x++)
        {
            if(ar[x]==-1)
            {
                continue;
            }
            for(int y=ar[x];y<=max;y+=ar[x])
            {
                if(set.containsKey(y))
                {
                    ArrayList<Integer> d=set.get(y);
                    for(int z:d)
                    {
                        if(x!=z)
                        {
                            ar[z] = -1;
                        }
                    }
                }
            }
        }
        long ans=0;
        for(int x=0;x<n;x++)
        {
            if(ar[x]!=-1)
            {
                ans++;
            }
        }
        if(ans==1)
        {
            ans=0;
        }
        out.println(ans);
        out.close();
    }

    public static void kamehameha()
    {
    }

    static class Kioken
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next()
        {
            while (!st.hasMoreTokens())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (Exception e)
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
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext()
        {
            String next = null;
            try
            {
                next = br.readLine();
            }
            catch (Exception e)
            {
            }
            if (next == null)
            {
                return false;
            }
            st = new StringTokenizer(next);
            return true;
        }
    }
}