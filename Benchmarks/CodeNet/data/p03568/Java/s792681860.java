import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cntEven = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp % 2 == 0)
				cntEven++;
		}

		int ans = (int) Math.pow(3, n) - (1 << cntEven);

		System.out.println(ans);

		sc.close();
	}

}
