import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
import java.util.*;
import java.lang.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class Main implements Runnable {

  static BufferedReader in;
  static PrintWriter out;
 
  public static void main(String[] args) {
      new Thread(null, new Main(), "whatever", 1<<29).start();
  }


  /* Iterative Function to calculate 
    (x^y)%p in O(log y) */
    static long power(long x, long y, long p) 
    { 
          
        // Initialize result 
        long res = 1L; 
      
        // Update x if it is more than or 
        // equal to p 
        x = x % p; 
                      
        while (y > 0L) 
        { 
              
            // If y is odd, multiply x 
            // with result 
            if (y % 2 == 1L) 
                res = (res * x) % p; 
      
            // y must be even now 
            y = y >> 1L; // y = y/2 
            x = (x * x) % p; 
        } 
          
        return res; 
    } 

    // Returns n^(-1) mod p 
    static long modInverse(long n, long p) 
    { 
        return power(n, p-2, p); 
    } 
      
    // Returns nCr % p using Fermat's 
    // little theorem. 
    static long nCrModPFermat(long n, long r, 
                                    long p) 
    { 
          
        // Base case 
        if (r == 0L) 
            return 1L; 
      
        // Fill factorial array so that we 
        // can find all factorial of r, n 
        // and n-r 
        long fac = 1L;
          
        for (int i = 1 ;i <= r; i++) {
          fac = (fac * (n-(i-1))) % p;
          fac = (fac * modInverse(i, p)) % p;
        }
      
        return fac; 
    }
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,n,aLen,bLen,mLen,i;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");

      aLen=Integer.parseInt(token[0]);
      bLen=Integer.parseInt(token[1]);
      mLen=Integer.parseInt(token[2]);

      int[] a=new int[aLen];
      int[] b=new int[bLen];

      str=in.readLine().trim();
      token=str.split(" ");

      int minA=Integer.MAX_VALUE;
      for(i=0;i<aLen;i++) {
        a[i]=Integer.parseInt(token[i]);
        minA=Math.min(a[i],minA);
      }

      str=in.readLine().trim();
      token=str.split(" ");

      int minB=Integer.MAX_VALUE;
      for(i=0;i<bLen;i++) {
        b[i]=Integer.parseInt(token[i]);
        minB=Math.min(b[i],minB);
      }

      int min=Integer.MAX_VALUE;

      for(i=0;i<mLen;i++) {
        str=in.readLine().trim();
        token=str.split(" ");

        int x=Integer.parseInt(token[0])-1;
        int y=Integer.parseInt(token[1])-1;
        int c=Integer.parseInt(token[2]);

        min=Math.min(min, a[x]+b[y]-c);
      }

      min=Math.min(min, minA+minB);

      out.println(min);

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
