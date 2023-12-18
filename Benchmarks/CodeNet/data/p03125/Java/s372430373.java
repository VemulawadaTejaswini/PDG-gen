import java.util.Scanner;

public class Main {

	public static int gcd(int a, int b) {
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		int r = a % b;
		if(r == 0)return b;
		return gcd(b, r);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b =sc.nextInt();
		sc.close();
		int g = gcd(a, b), ans = 0;
		if(g == a)ans = a + b;
		else ans = b - a;
		System.out.println(ans);
	}

}
