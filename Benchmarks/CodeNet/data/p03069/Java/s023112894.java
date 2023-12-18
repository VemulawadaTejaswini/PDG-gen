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
		String progress = s;
		while(true) {
			if(progress.contains("#.")) {
				progress = progress.replaceFirst("[#][.]", "##");
				ans += 1;
			} else {
				break;
			}
		}
		System.out.println(ans);
	}

}