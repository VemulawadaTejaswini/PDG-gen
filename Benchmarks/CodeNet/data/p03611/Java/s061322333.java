import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[100000];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			c[a]++;
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < 100000 - 2; i++) {
			int val = c[i] + c[i + 1] + c[i + 2];
			ans = Math.max(ans, val);
		}
		System.out.println(ans);
	}
}
