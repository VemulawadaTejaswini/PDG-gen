import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		String answer = "Yes";
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			if (h[i] > h[i + 1]) {
				h[i] = h[i] - 1;
			}
		}
		for (int i = 0; i < n - 1; i++) {
			if (h[i] > h[i + 1]) {
				answer = "No";
			}
			if (h[n - 2] == h[n - 1]) {
				answer = "No";
			}
		}
		System.out.println(answer);
	}
}