import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] aa = new int[n + 1];
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int j = sc.nextInt();
			aa[i] = j;
			if (aa[j] == 0) {
				continue;
			} else if (aa[j] == i) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}
