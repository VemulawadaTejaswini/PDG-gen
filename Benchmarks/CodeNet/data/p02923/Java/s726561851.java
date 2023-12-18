import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
public class Main
{
 static int lds(int arr[], int n) 
{ 
    
    int max = 0, len = 0; 
      
    
    for (int i=1; i<n; i++) 
    { 
        
        if (arr[i] <= arr[i-1]) 
            len++; 
        else
        { 
            
            if (max < len)     
                max = len; 
                  
            
            len = 0;     
        }     
    } 
  
    if (max < len) 
        max = len; 
      
    
    return max; 
} 
  
    public static void main(String[] args)throws IOException
    {
        FastReader in=new FastReader(System.in);
        StringBuffer st=new StringBuffer();
        
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
          
        System.out.println(lds(a,n));
    }
    static class FastReader{
 
        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;
 
        FastReader(InputStream is) {
            in = is;
        }
 
        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }
 
        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan());
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }
 
        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan());
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
 
        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan());
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}      