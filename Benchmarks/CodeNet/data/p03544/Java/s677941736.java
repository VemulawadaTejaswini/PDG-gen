import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0L;
		long bef2 = 2L;
		long bef1 = 1L;
		if (n == 1) {
			System.out.println(bef1);
			return;
		}
		for (int i = 2; i <= n; i++) {
			ans = bef1 + bef2;
			bef2 = bef1;
			bef1 = ans;
		}
		System.out.println(ans);
	}
}