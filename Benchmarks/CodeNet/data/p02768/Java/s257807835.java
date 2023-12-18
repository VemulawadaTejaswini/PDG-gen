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

      int t,x1,n,a,b,MOD=1000000007;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);
      a=Integer.parseInt(token[1]);
      b=Integer.parseInt(token[2]);

      int waystoA=(int)nCrModPFermat(n, a, MOD);
      int waystoB=(int)nCrModPFermat(n, b, MOD);
      int totalWays=(int)power(2, n, MOD)-1;
      if(totalWays<0) {
        totalWays+=MOD;
      }

      totalWays-=waystoA;
      if(totalWays<0) {
        totalWays+=MOD;
      }

      totalWays-=waystoB;
      if(totalWays<0) {
        totalWays+=MOD;
      }

      out.println(totalWays);


      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
