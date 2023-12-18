import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int ans = 1;
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = scan.next();
		}

		Arrays.sort(S);

		for (int i = 1; i < N; i++) {
			if (!S[i].equals(S[i-1])) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}