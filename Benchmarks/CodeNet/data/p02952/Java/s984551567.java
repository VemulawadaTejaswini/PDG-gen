import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int ans = 0;
		if (n <= 9)
			ans = n;
		else if (10 <= n && n <= 99)
			ans = 9;
		else if (100 <= n && n <= 999)
			ans = n - 90;
		else if (1000 <= n && n <= 9999)
			ans = 909;
		else if (10000 <= n && n <= 99999)
			ans = n - 9090;
		else if (100000 == n)
			ans = 90909;

		System.out.println(ans);

	}

}
