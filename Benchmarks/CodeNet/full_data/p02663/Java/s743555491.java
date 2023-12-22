import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.math.BigInteger;
 
public class Main
{  
 
    //Life's a bitch
    //Ain't gonna stop.
    public static boolean[] sieve(long n)
    {
        boolean[] prime = new boolean[(int)n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        long m = (long)Math.sqrt(n);
        for(int i=2;i<=m;i++)
        {
            if(prime[i])
            {
                for(int k=i*i;k<=n;k+=i)
                {
                    prime[k] = false;
                }
            }
        }
        return prime;
    } 
 
    
    static long GCD(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        return GCD(b,a%b);
    }
 
    static long CountCoPrimes(long n)
    {
        long res = n;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    n/=i;
                }
                res-=res/i;
            }
        }
        if(n>1)
        {
            res-=res/n;
        }
        return res;
    }
    
    long expo(long a,long  b)
    {
        long result = 1;

          while (b>0){
            if ((b%2)==1){
              result *= a;
            }
            b >>=1 ;
            a *= a;
          }

      return result;
    }
 
    
 
    
 
    
    static void reverse(int[] a){
        int n = a.length-1;
        int start = 0;
        int end = n;
        while(start<end){
            int temp = a[start];
            a[start] =a[end];
            a[end] = temp;
            start++;
            end--;

        }
    }
   
   
  
    public static void main(String[] args) throws IOException
    {
     
        new Main().run();
       
    }
 
 
    
    static long LCM(long a,long b)
    {
        return (a*b)/GCD(a,b);
    }
   
    FastReader in = new FastReader();
    static long mod = (long)1e9+7;
       
    // static int[] arr,tree[],lev;
    void run() throws IOException
    {
        // prob C not done
        int h1 = ni();
        int m1 = ni();
        int h2 = ni();
        int m2 = ni();
        long k = nl();
        if(h1==0){
            h1 = 24;
        }
        if(h2==0)
        {
            h2 = 24;
        }
        if(h1>h2){
            h1-=12;
        }

        
            printL(Math.max(0,Math.abs(h1-h2)*60+Math.abs(m1-m2)-k));
        
        //13 12
        // 23 1
        // 11 1

        
       




       

       
    }
       
       
    



   
   



   
    




   
    
    


    




  

 

    
 
 
 
 
 
 
    
 
    //xor range query
    static long xor(long n)
    {
 
        if(n%4==0)
        {
            return n;
        }
        if(n%4==1)
        {
            return  1;
        }
        if(n%4==2)
        {
            return n+1;
        }
        return 0;
    }
 
    static long xor(long a,long b)
    {
        return xor(b)^xor(a-1);
    }
 
 
    
 
  
   
    
 
    
       
    
 
    
   
  
 
 
 
   
 
     void printL(long a)
    {
        System.out.println(a);
    }
    void printS(String s)
    {
        System.out.println(s);
    }
 
     void printD(Double d)
    {
        System.out.println(d);
    }
  
    
    
    static long max(long n,long m)
    {
        return Math.max(n,m);
    }
    static long min(long n,long m)
    {
        return Math.min(n,m);
    }
 
    double nd() throws IOException
    {
        return Double.parseDouble(in.next());
    }


    int ni() throws IOException
    {
        return Integer.parseInt(in.next());
    }
 
    long nl() throws IOException
    {
        return Long.parseLong(in.next());
    }
 
    String si() throws IOException
    {
        return in.next();
    }
 
 
  
   
    static long abs(long n)
    {
        return Math.abs(n);
    }
 
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
 
    
}
 
 
 
class Pair implements Comparable<Pair>
{
   int x,y;
    public Pair(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair o)
    {
        if(o.x==this.x)
        {
            return this.y-o.y;
        }
        return this.x-o.x;
    }
}

