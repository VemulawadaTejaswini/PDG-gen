import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split("");

		int wSum = 0;
		int eSum = 0;

		for (int i = 0; i < n; i++) {
			if (str[i].equals("W")) {
				wSum++;
			} else {
				eSum++;
			}
		}

		int ans = Integer.MAX_VALUE;

		int leftW = 0;
		int leftE = 0;

		for (int i = 1; i < n; i++) {
			int rightE = eSum - leftE;
			if (str[i].equals("E"))
				rightE--;

			ans = Math.min(ans, leftW + (rightE));

			if (str[i].equals("W")) {
				leftW++;
			} else {
				leftE++;
			}
		}
		System.out.println(ans);
	}
}
