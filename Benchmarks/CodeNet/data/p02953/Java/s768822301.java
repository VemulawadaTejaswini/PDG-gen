import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int h[] = new int[n];
		String answer = null;
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for (int t = 0; t < n - 1; t++) {
			if (h[t + 1] + 2 <= h[t]) {
				answer = "No1";
				break;
			} else if (h[t] > h[t + 1] && h[t + 1] > h[t + 2]) {
				answer = "No2";
				break;
			} else if (h[t] == h[t + 1] && h[t + 1] > h[t + 2]) {
				answer = "No3";
				break;
			} else {
				answer = "Yes";
			}
		}
		System.out.println(answer);
	}
}