import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(gcd(a,b));
	}
	
	public static int gcd(int x, int y) {
		if (x % y == 0) {
			return y;
		}
		else {
			return gcd(y, x % y);
		}
	}
}
