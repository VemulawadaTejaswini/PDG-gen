import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    
    public static BufferedReader br;
    public static StringTokenizer sto;
    
    public static void main(String args[] ) throws Exception {
        StringBuffer str = new StringBuffer();
        PrintWriter pw=new PrintWriter(System.out);
        br = new BufferedReader(new InputStreamReader(System.in));
    
        int[] in = arrayInt(2);
        int n = in[0];
        long d = in[1];
        int ans=0;
        while(n-->0){
            long[] p = arrayLong(2);
            long di = p[0]*p[0]+p[1]*p[1];
            if(di<=d*d){
                ans++;
            }
        }
        str.append(ans);
        
        pw.println(str.toString());
        
        pw.close();
    }
     
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static int[] arrayInt(int n) throws Exception{
       sto = new StringTokenizer(br.readLine());
       int[] newarray = new int[n];
       for(int i=0;i<n;i++){
           newarray[i] = Integer.parseInt(sto.nextToken());
       }
       return newarray;
    }
    
    public static long[] arrayLong(int n) throws Exception{
       sto = new StringTokenizer(br.readLine());
       long[] newarray = new long[n];
       for(int i=0;i<n;i++){
           newarray[i] = Long.parseLong(sto.nextToken());
       }
       return newarray;
    }
   
   
   public static double nextDouble() throws Exception{
       return Double.parseDouble(br.readLine());
   }
   
   public static long nextLong() throws Exception{
       return Long.parseLong(br.readLine());
   }
   
   
   public static int nextInt() throws Exception{
       return Integer.parseInt(br.readLine());
   }
   
}