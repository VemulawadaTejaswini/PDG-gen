
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        FastReader f = new FastReader();
        
     long n = f.nextLong();
     long q=(long)Math.sqrt(n);
     ArrayList<Long> a1 = new ArrayList<Long>();

     for(long i = 1 ;i <= q ; i++){
         if(n%i==0){
         a1.add(i);
        // long x =(long)(n/i);
         a1.add((long)(n/i));
         
         }
     }
     
        long [] arr = new long[a1.size()];
        for(int i= 0;i<arr.length;i++){
            arr[i]=a1.get(i);
        }
     Arrays.sort(arr);
     int mid=(int)arr.length/2;     
     
       System.out.println((arr[mid] + arr[mid-1])-2);
        
        
     
     
    }   
 }




class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
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
  
        byte nextByte() 
        { 
            return Byte.parseByte(next()); 
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
