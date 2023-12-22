import java.util.*;
public class Main {

	public static int gcd(int a, int b) {
		return b == 0 ? a: gcd(b, a % b);
	}
	
	public static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		System.out.println(lcm(360, X)/X);
	}

}
