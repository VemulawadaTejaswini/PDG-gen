import java.util.*;

public class Main {
	static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long diff = Math.abs(X-Y);
		System.out.println(diff%3==0 || diff<=1 ? "Brown" : "Alice");
		
		sc.close();
	}
}
