import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long l = 1;
        for(int i = 0; i < n; i++){
            l = lcm(l,sc.nextLong()/2);
        }
        //System.out.println(l);
        if(m < l){
            System.out.println(0);
        }else{
            m -= l;
            System.out.println(1+m/(l*2));
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