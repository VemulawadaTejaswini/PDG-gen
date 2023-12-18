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
    //I'll never stop.
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
 
    
 
    
 
    
    static boolean isSorted(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return false;
            } 
        }
        return true;
    }
   
 
 
   
   
  
    public static void main(String[] args) throws IOException
    {
     
        new Main().run();
       
    }
 
 
    
    static long LCM(long a,long b)
    {
        return (a*b)/GCD(a,b);
    }
   
 
    Scanner in = new Scanner(System.in);
    // static int[] arr,tree[],lev;
    void run() throws IOException
    {
       
        int n = ni();
        int m = ni();
        long[] h = new long[n];
        for(int i=0;i<n;i++)
        {
            h[i] = nl();
        }

        HashSet<Long> hash = new HashSet<>();
        long a = nl();
        long b = nl();
        HashSet<Long> h1 = new HashSet<>();
        h1.add(b);
        h1.add(a);
        if(h[(int)a-1]>h[(int)b-1])
        {
            // hash.add(a);
            h1.add(a);
            hash.add(a);
        }
        else if(h[(int)b-1]>h[(int)a-1]){
            
            hash.add(b);
        }
        m--;
        while(m-->0)
        {
            a = nl();
            b  = nl();
            h1.add(a);
            h1.add(b);
            if(h[(int)b-1]>h[(int)a-1])
            {
                if(hash.contains(a))
                {
                    hash.remove(a);
                    
                }
                hash.add(b);
            }
            else if(h[(int)a-1]>h[(int)b-1]) {
                if(hash.contains(b))
                {
                    hash.remove(b);
                    
                }
                hash.add(a);
            }


           



        }

        // printL(h1.size());

        printL(hash.size()+(n-h1.size()));
           

    
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
  
   
   
    static void swap(char[] c,int a,int b)
    {
        char t = c[a];
        c[a] = c[b];
        c[b] = t;
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
 
    static class Scanner 
    {
        StringTokenizer st;
        BufferedReader br;
 
        public Scanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}
 
        public String next() throws IOException 
        {
            while (st == null || !st.hasMoreTokens()) 
            {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
 
        public int nextInt() throws IOException {return Integer.parseInt(next());}
        
        public long nextLong() throws IOException {return Long.parseLong(next());}
 
        public String nextLine() throws IOException {return br.readLine();}
 
        public boolean ready() throws IOException {return br.ready();}
 
 
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
        return this.y-o.y;
    }
}

