import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int n = in.nextInt();
		String s = in.next();

		solve(n, s);

		in.close();

	}

	private static void solve(int n, String s) {
		
		int ans = 0;
		String[] array = s.split("");
		
		for(int i = 0; i < n - 1; i++) {
			if("#".equals(array[i]) && ".".equals(array[i + 1])) {
				array[i + 1] = "#";
				ans += 1;
			}
		}
		
		System.out.println(ans);
	}

}