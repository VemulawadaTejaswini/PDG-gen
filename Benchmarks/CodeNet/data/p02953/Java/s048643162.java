import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		String ans = "Yes";

		for (int i = 0; i < h.length - 1; i++) {
			if (h[i] <= h[i+1]) {
				continue;
			} else {
				h[i]--;
				if (h[i] <= h[i+1] && (i != 0 && h[i-1] <= h[i])) {
					continue;
				} else {
					ans = "No";
					break;
				}
			}
		}

		System.out.println(ans);
		sc.close();

	}
}