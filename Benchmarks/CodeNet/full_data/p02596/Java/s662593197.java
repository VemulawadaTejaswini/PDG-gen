import java.io.BufferedReader; 
import java.io.*;
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;
import java.math.*;
public class Main 
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
   public static void main(String args[])
    {
        Scanner  sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int t=1;//sc.nextInt();
        long ans=0,te=0;
        BigInteger mod=BigInteger.valueOf(7),k=sc.nextBigInteger();BigInteger test= new BigInteger("77777777777777777777777777777");
        while(mod.compareTo(test)<=0)
        {
         ans++;
         if(mod.mod(k).compareTo(BigInteger.ZERO)==0){pw.println(ans);te=1;break;}
         mod=BigInteger.valueOf(10).multiply(mod).add(BigInteger.valueOf(7));
        }
        if(te==0) pw.println(-1);
           pw.close();
    }
}
  