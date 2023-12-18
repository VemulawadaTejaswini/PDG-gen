import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(cal(sc.nextInt(),0));
	}

	private static int cal(int n, int cnt) {
		if (n < 6) return cnt + n;
		else if (n < 9) return cnt + 1 + n % 6;
		int tmp6 = 6;
		int tmp9 = 9;
		while (n >= tmp6 * 6) {
			tmp6 *= 6;
		};
		while (n >= tmp9 * 9) {
			tmp9 *= 9;
		};
		return Math.min(cal(n-tmp6,cnt+1), cal(n-tmp9,cnt+1));
	}
}
