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
 
 
    
 
    
 
    static boolean prime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
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
         int r = 0;
         int g = 0;
         int b = 0;
         String S = si();
         for(int i=0;i<n;i++)
         {
            if(S.charAt(i)=='R')
            {
                r++;
            }
            else if(S.charAt(i)=='G')
            {
                g++;
            }
            else{
                b++;
            }
         }

         long ans = r*g*b;
         for(int i=0;i<n;i++)
         {
            for(int j=i+1;j<n;j++)
            {
                if(2*j-i>=n)
                {
                    break;
                }
                char c1 = S.charAt(i);
                char c2 = S.charAt(2*j-i);
                char c3 = S.charAt(j);
                if(c1!=c2 && c1!=c3 && c2!=c3)
                {
                    ans--;
                }
            }
         }
       

        printL(ans);
      


           

    
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

