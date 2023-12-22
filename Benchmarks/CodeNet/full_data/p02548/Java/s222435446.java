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
    static long countDivisors(int n) 
    { 
        // Note that this loop runs till square root 
        long cnt=0;
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                // If divisors are equal, print only one 
                if (n/i == i) 
                    cnt++;
       
                else // Otherwise print both 
                    cnt+=2;
            } 
        } 
        return cnt;
    } 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long ans=0L;
        for(int i=1;i<=n-1;i++)
            ans+=countDivisors(i);
        System.out.println(ans);
    
    }

}
