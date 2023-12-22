import java.io.*;
import java.util.*;
 
public class Main {
 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    private static StringTokenizer st;
 
    public static void main ( String [] args ) throws IOException
    {
    new Main().cal();
    }
 
  
    private void cal() throws IOException 
    {
    int N = Integer.parseInt(br.readLine());
    int [] nums = new int[N];
     
    for(int i = 0; i < N; i++)
        nums[i] = Integer.parseInt(br.readLine());
 
    int count = 0;
    for(int n : nums)
        if ( isPrime(n) ) count++;
 
    System.out.println(count);
 
    }
 
    private boolean isPrime(int n) {
    if ( n == 2 ) return true;
    else if ( n % 2 == 0 ) return false;
    else if ( n < 9 ) return true;
    else if ( n % 3 == 0 ) return false;
    else {
        for(int i = 5; i * i <= n; i+=6) {
        if ( n % i == 0 ) return false;
        else if ( n % (i+2) == 0 ) return false;
        }
        return true;
    }
 
 
    }
 
}