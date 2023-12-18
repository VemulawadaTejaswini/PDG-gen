import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        long cntA = 0;
        long cntB = 0;
        long lcm = lcm(c, d);

  
        cntA = a - a / c - a / d + a / lcm(c, d);
        cntB = b - b / c - b / d + b / lcm(c, d);
 
        long res = (cntB - cntA);
        if(a % c != 0 && a % d != 0) res++;
        System.out.println(res);
    }

    private static long gcd(long a, long b) {
    	if(b == 0)
    		return a;
    	return gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
    	return a / gcd(a, b) * b;
    }

}


