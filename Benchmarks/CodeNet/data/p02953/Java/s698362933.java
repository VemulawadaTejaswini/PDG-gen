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
				if (h[i]-1 != h[i+1] || h[i]-1 < 0) {
					ans = "No";
					break;
				} else if (i != 0 && h[i-1] > h[i]-1) {
					ans = "No";
					break;
				} else {
					h[i]--;
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}
}
