import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = 1;
		for (int i = 0; i < n; i++) {
			if (x * 2 > x + k) {
				x += k;
			} else {
				x *= 2;
			}
		}
		System.out.println(x);
	}
}
