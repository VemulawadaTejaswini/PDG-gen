import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


/**
 *
 * @author USER
 */
public class Main {
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
    
    static class BufPrint
    {
        final BufferedWriter bw;
        public BufPrint()
        {
            this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
        }
        public void print(Object object)throws IOException
        {
            bw.append(""+object);
        }
        public void println(Object object)throws IOException
        {
            print(object);
            bw.append("\n");
        }
        public void close()throws IOException
        {
            bw.close();
        }
    }
    

        public static int GCD(int l,int r) {
        int gcd=1;
        for(int i = 1; i <= l && i <= r; ++i)
        {
            // Checks if i is factor of both integers
            if(l % i==0 && r % i==0)
                gcd = i;
        }
    return gcd;
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
            FastReader sc=new FastReader(); 
            BufPrint bp=new BufPrint();

//            int t=sc.nextInt();
//            
//            for(int k1=0;k1<t;k1++){
                String s=sc.next();
                
                long sum=0L;
                for(int i=0;i<s.length();i++)
                {
                    sum=sum+Character.valueOf(s.charAt(i))-48;
                }
                if(sum%9==0){
                    bp.println("Yes");
                }
                else
                    bp.println("No");
 
//            }
            
           
           
                bp.close();
            
    }
}