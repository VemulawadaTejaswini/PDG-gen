
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min = Math.min(x, y);
		long ans = 0;
		if(a + b < 2 * c) {
			ans += min * (a + b);
		} else {
			ans += min * 2 * c;
		}
		if(x > y) {
			if(a < 2 * c) {
				ans += (x - min) * a;
			} else {
				ans += (x - min) * 2 * c;
			}
		} else {
			if(b < 2 * c) {
				ans += (y - min) * b;
			} else {
				ans += (y - min) * 2 * c;
			}
		}
		System.out.println(ans);
	}

}
