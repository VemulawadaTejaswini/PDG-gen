import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		int ans = gcd(Math.abs(Integer.parseInt(sc.next())-x), Math.abs(Integer.parseInt(sc.next())-x));
		for(int i=2; i<n; i++){
			int x_elem = Integer.parseInt(sc.next());
			ans = gcd(ans, Math.abs(x_elem-x));
		}
		System.out.println(ans);
	}

	public static int gcd(int num1, int num2) {
		int x = Math.max(num1, num2);
		int y = Math.min(num1, num2);

		while (y != 0) {
			int tmp = x;
			x = y;
			y = tmp%y;
		}
		return x;
	}
}
