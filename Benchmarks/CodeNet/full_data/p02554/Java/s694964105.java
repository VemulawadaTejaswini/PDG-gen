import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main
{
    static int power(long x, int y) 
    { 
        // Initialize result 
        long res = 1L;      
         
        // Update x if it is more   
        // than or equal to p 
        x = x % 1000000007;  
  
       if (x == 0) return 0; // In case x is divisible by p;    
  
        while (y > 0) 
        { 
            // If y is odd, multiply x 
            // with result 
            if((y & 1)==1) 
                res = (res * x) % 1000000007; 
      
            // y must be even now 
            // y = y / 2 
            y = y >> 1;  
            x = (x * x) % 1000000007;  
        } 
        res %= 1000000007;
        return (int)res; 
    } 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int tmp1=power(10,n);
        int tmp2=power(9,n);
        int tmp3=power(8,n);
        int tmp=tmp1-2*tmp2+tmp3;
        while(tmp<0)
            tmp+=1000000007;
        tmp%=1000000007;
        System.out.println(tmp);
        
    }
}