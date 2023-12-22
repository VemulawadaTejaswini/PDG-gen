import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			solve();
	}

	public static void solve() { 
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();
		long max = Long.MIN_VALUE;
		long n1 = a * c;
		long n2 = a * d;
		long n3 = b * c;
		long n4 = b * d;
		max = Math.max(max, Math.max(n1, Math.max(n2, Math.max(n3, n4))));
		System.out.println(max);
	}
}