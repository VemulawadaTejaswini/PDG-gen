import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		int ans = sc.nextInt();
		for(int i = 1; i < n; i++) {
			ans = gcd(ans, sc.nextInt());
		}

		System.out.println(ans);
	}

	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}
