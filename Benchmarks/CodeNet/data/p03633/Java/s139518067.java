import java.util.*;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        for(int i = 0; i < n; i++) {
        	t[i] = sc.nextLong();
        }
        if(n == 1) {
        	System.out.println(t[0]);
        	return;
        }
        long lcm = 1;
        for(int i = 0; i < n; i++) {
        	lcm = lcm / gcd(lcm, t[i]) * t[i];
        }
        System.out.println(lcm);
    }
	
	public static long gcd(long a, long b) {
		if(a % b == 0) return b;
		return gcd(b, a % b);
	}
}