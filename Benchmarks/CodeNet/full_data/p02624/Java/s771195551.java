/*
    Author: @__goku__
    ssrivastava990@gmail.com

                   `\-.   `
                      \ `.  `
                       \  \ |
              __.._    |   \.       S O N - G O K U
       ..---~~     ~ . |    Y
         ~-.          `|    |
            `.               `~~--.
              \                    ~.
               \                     \__. . -- -  .
         .-~~~~~      ,    ,            ~~~~~~---...._
      .-~___        ,'/  ,'/ ,'\          __...---~~~
            ~-.    /._\_( ,(/_. 7,-.    ~~---...__
           _...>-  P""6=`_/"6"~   6)    ___...--~~~
            ~~--._ \`--') `---'   9'  _..--~~~
                  ~\ ~~/_  ~~~   /`-.--~~
                    `.  ---    .'   \_
                      `. " _.-'     | ~-.,-------._
                  ..._../~~   ./       .-'    .-~~~-.
            ,--~~~ ,'...\` _./.----~~.'/    /'       `-
        _.-(      |\    `/~ _____..-' /    /      _.-~~`.
       /   |     /. ^---~~~~       ' /    /     ,'  ~.   \
      (    /    (  .           _ ' /'    /    ,/      \   )
      (`. |     `\   - - - - ~   /'      (   /         .  |
       \.\|       \            /'        \  |`.           /
       /.'\\      `\         /'           ~-\         .  /\
      /,   (        `\     /'                `.___..-      \
     | |    \         `\_/'                  //      \.     |
     | |     |                 _Seal_      /' |       |     |
 */

import java.io.*;
import java.util.*;

public class Main
{
    static PrintWriter out = new PrintWriter((System.out));

    public static void main(String args[]) throws IOException
    {
        Kioken sc = new Kioken();
        int n=sc.nextInt();
        int ar[]=new int[n+1];
        ar[1]=1;
        for(int x=2;x<ar.length;x++)
        {
            if(ar[x]!=0)
            {
                continue;
            }
            ArrayList<Integer> set=kamehameha(x);
            int i=1;
            long y=(long)x;
            while(y<ar.length)
            {
                ar[(int)y]=1;
                for(int d:set)
                {
                    ar[(int)y]*=(i*d+1);
                }
                i++;
                y=y*(long)x;
            }
        }
        long dp[]=new long[ar.length];
        dp[0]= 0L;
        for(int x=1;x<ar.length;x++)
        {
            dp[x]=dp[x-1]+(long)x*ar[x];
        }
        out.println(dp[n]);
        out.close();
    }
    public static ArrayList<Integer> kamehameha(int n)
    {
        ArrayList<Integer> set=new ArrayList<>();
        int i=0;
        while(n%2==0)
        {
            n/=2;
            i++;
        }
        if(i!=0)
        {
            set.add(i);
        }
        for(int x=3;x<=Math.sqrt(n);x+=2)
        {
            i=0;
            while(n%x==0)
            {
                i++;
                n/=x;
            }
            if(i!=0)
            {
                set.add(i);
            }
        }
        if(n>1)
        {
            set.add(1);
        }
        return set;
    }
    public static int lower_bound(ArrayList<Integer> ar, int k)
    {
        int s = 0, e = ar.size();
        while (s != e)
        {
            int mid = s + e >> 1;
            if (ar.get(mid) <= k)
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
        }
        return Math.abs(s) - 1;
    }

    public static int upper_bound(ArrayList<Integer> ar, int k)
    {
        int s = 0;
        int e = ar.size();
        while (s != e)
        {
            int mid = s + e >> 1;
            if (ar.get(mid) < k)
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
        }
        if (s == ar.size())
        {
            return -1;
        }
        return s;
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