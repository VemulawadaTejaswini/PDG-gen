import java.util.Scanner;

public class Main {
	public static final int gcd(final int a, final int b) {
	    return (b == 0) ? a : gcd(b, a % b);
	}
	public static final int lcm(final int a, final int b) {
	    return a * b / gcd(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		int d = gcd(a, b);
		int e = lcm(a, b);		
		System.out.println(d+" "+e);
		}
}