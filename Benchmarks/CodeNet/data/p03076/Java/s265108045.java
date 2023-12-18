import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean ta[];

	public static int solve(int a[], int cur) {
		int ans = 130 * 5 + 1, tmp = 0, tmpa = 0;
		if (cur == 5)
			return 0;
		for (int i = 0; i < a.length; ++i) {
			if (!ta[i]) {
				ta[i] = true;
				tmpa = a[i];
				if(a[i] % 10 != 0 && cur < 4)
					tmpa += (10 - a[i] % 10);
				tmp = tmpa + solve(a, cur + 1);
				ans = Math.min(ans, tmp);
				ta[i] = false;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		ta = new boolean[5];
		for (int i = 0; i < 5; ++i)
			a[i] = sc.nextInt();
		sc.close();
		int ans = 0;
		ans = solve(a, 0);
		System.out.println(ans);
	}

}
