import java.util.Scanner;

public class Main {
	static int N;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		dfs(0);

		System.out.println(ans);
	}

	static void dfs(long x) {
		if (x > N) {	//Nを超えたらダメ
			return;
		}

		if (check(x)) {		//3, 5, 7を含んでいるかを確認
			ans++;
		}

		if (x <= 1000000000) {
			dfs(10 * x + 3);
			dfs(10 * x + 5);
			dfs(10 * x + 7);
		}
	}

	static boolean check(long x) {
		String s = String.valueOf(x);
		if (s.contains("3") && s.contains("5") && s.contains("7")) {
			return true;
		} else {
			return false;
		}
	}
}