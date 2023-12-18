import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		String ans = "No";

		for (int i = 0; i < h.length-1; i++) {
			if (h[i] <= h[i+1]) {
				if (i == 0 || (i != 0 && h[i-1] <= h[i])) {
					ans = "Yes";
					break;
				}
			} else {
				h[i]--;
				if (h[i] <= h[i+1]) {
					if (i == 0 || (i != 0 && h[i-1] <= h[i])) {
						ans = "Yes";
						break;
					}
				}
			}
		}

		System.out.println(ans);
		sc.close();

	}
}