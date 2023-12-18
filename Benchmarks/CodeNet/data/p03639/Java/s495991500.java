import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int two = 0;
		int a = 0;
		int ans = 0;
		int ans2 = 0;
		int ten = 0;
		int upper = 0;

		for (int i=0; i < N; i++) {
			a = sc.nextInt();

			if (a > 2) {
				upper = 1;
			}

			if (a == 2) {
				two++;
				continue;
			}
			if (a == 10) {
				ten++;
				continue;
			}

			if (a % 4 == 0) {
				ans++;
			} else {
				ans2++;
			}
		}

		if (two == N) {
			System.out.println("Yes");
			System.exit(0);
		}

		if (ten == N) {
			System.out.println("Yes");
			System.exit(0);
		}

		if (upper == 0) {
			System.out.println("No");
			System.exit(0);
		}

//		System.out.println(ans);

	//	if (two % 2 == 0) {
			ans += two/2;
			ans += ten/2;
	//	}
			ans2 += two%2;
			ans2 += ten%2;


		if (ans2 - ans <= 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}





	}
}

