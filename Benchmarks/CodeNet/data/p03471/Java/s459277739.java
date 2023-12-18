import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();

		for (int i = y / 10000 ; i >= 0 ; i--) {
			if (y >= 10000 * i) {
				int n2 = n - i;
				int y2 = y - 10000 * i;
				if (y2 == 0 && n2 == 0) {
					finish(i,0,0);
				}
				for (int k = n2 ; k >= 0 ; k--) {
					int n3 = n2 - k;
					int y3 = y2 - 5000 * k;
					if (n3 * 1000 == y3) {
						finish(i,k,n-i-k);
					}
				}
			}
		}
		finish(-1,-1,-1);
	}

	private static void finish(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
		System.exit(0);
	}
}