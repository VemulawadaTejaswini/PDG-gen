import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = m * 1900 + (n - m) * 100;
		System.out.println(v * power(2, m));
	}
	
	public static int power(int x, int y) {
		if (y == 1) {
			return x;
		} else {
			return x * power(x, y - 1);
		}
	}
}
