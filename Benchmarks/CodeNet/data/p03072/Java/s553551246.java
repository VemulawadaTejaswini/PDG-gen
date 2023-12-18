import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int max = h[0];
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			if (max > h[i]) {
			} else if (max < h[i]) {
				cnt++;
				max = h[i];
			} else if (max == h[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
