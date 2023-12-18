import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        long N = Long.parseLong(sc.next());
        long ans = 1;
        for(int i=0;i<N;i++){
           long t = Long.parseLong(sc.next());
           ans = lcm(ans, t);
        }

        System.out.print(ans);
        System.out.println();
    }
    
    public static final long gcd(long a, long b) {
    //a > b にする（スワップ）
    if(b == 0) return a;
     return gcd(b,a%b);
    }
    
    public static final long lcm(long a, long b) {
    long g = gcd(a,b);
    return a / g * b;
    }



}