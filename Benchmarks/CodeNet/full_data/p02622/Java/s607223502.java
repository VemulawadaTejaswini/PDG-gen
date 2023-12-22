
import java.util.*;

public class Main
{

    private final static int MOD = 1_000_000_007;

    public static int gcd(int a, int b) { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    }
    
    public static long mod(long a, long b) {
        return ((a % b) + b ) % b;
    }

    public static int mod (int a, int b) {
        return ((a % b) + b ) % b;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	String t = in.nextLine();
	int res = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) != t.charAt(i)) res++;
	}
	System.out.println(res);
	in.close();
    }
}
