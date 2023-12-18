import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int[] p = new int[N];
	static {
		Arrays.setAll(p, i->sc.nextInt());
	}
	public static void main(String[] args) {
		Arrays.sort(p);
		int ans = 0;
		for (int i = 0; i < p.length; i++) {
			if (i == p.length - 1) {
				ans += p[i]/2;
			} else {
				ans += p[i];
			}
		}
		System.out.println(ans);
	}
}
