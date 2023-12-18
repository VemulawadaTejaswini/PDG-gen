import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tot = 0;

		for (int i = 0; i <= n; i++) {
			int ans = calcSumofDigits(i);
//			System.out.print(" ans_out "+ ans);
//			System.out.println(" i "+ i);
			if (a <= ans && ans <= b) {
				tot += i;
			}

		}
		System.out.println(tot);
	}

	static int calcSumofDigits(int n) {
		int ans = 0;
		while (n > 0) {
			ans += n % 10;
			n = n / 10;
//   			System.out.println(" ans "+ ans);
//   			System.out.println(" n "+ n);
		}
		return ans;
	}
}
