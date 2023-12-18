import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		long ans = 0;
		long add = 1;
		for (int i = 0; i < k; i++) {
			long next = ans + add * 10;
			ans += add;
			int sn = sum(next);
			int sa = sum(ans);
			if (next * sa < ans * sn) {
				ans = next;
				add *= 10;
			}
			System.out.println(ans);
		}
	}

	static int sum(long n) {
		int ret = 0;
		while (n > 0) {
			ret += n % 10;
			n /= 10;
		}
		return ret;
	}
}
