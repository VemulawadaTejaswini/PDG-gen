import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] ll = new long[n];
        boolean isOdd = false;
        boolean isEven = false;
        for(int i = 0; i < n; i++){
            long tmp = sc.nextLong();
            ll[i] = tmp;
            if((tmp/2) % 2 == 0){
                isEven = true;
            }else{
                isOdd = true;
            }
        }
        if(isEven && isOdd){
            System.out.println(0);
        }else if(isEven){
            System.out.println(solveByEven(ll,m));
        }else{
            System.out.println(solveByOdd(ll,m));
            
        }
        
    }
    
    private static long solveByEven(long[] ll, int m){
        long l = 1;
        for(int i = 0; i < ll.length; i++){
            if(l % (ll[i]/2) == 0 || (ll[i]/2) % l == 0){
                return 0;
            }
            l = lcm(l,ll[i]/2);
        }
        if(m < l){
            return 0;
        }else{
            m -= l;
            return 1+(m/(l*2));
        }
        
    }
    
    private static long solveByOdd(long[] ll, int m){
        long l = 1;
        for(int i = 0; i < ll.length; i++){
            l = lcm(l,ll[i]/2);
        }
        if(m < l){
            return 0;
        }else{
            m -= l;
            return 1+(m/(l*2));
        }
    }
    
    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
    
    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }
}