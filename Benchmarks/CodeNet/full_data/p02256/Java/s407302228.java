import java.util.*;
public class Main {
	
	public static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a >= b) {
			return gcd(b, a % b);
		}
		else if(b >= a) {
			return gcd(a, b % a);
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(gcd(s.nextInt(), s.nextInt()));
		
	}

}

