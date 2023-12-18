import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();

		solve(n, s, k);

		in.close();

	}

	private static void solve(int n, String s, int k) {

		String[] array = s.split("");
		String target = array[k - 1];

		String ans = "";

		for (int i = 0; i < n; i++) {
			if (!target.equals(array[i])) {
				ans += array[i] = "*";
			} else {
				ans += array[i];
			}
		}

		System.out.println(ans);
	}

}
