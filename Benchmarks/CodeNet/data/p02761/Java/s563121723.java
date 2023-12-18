import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] num = new int[n + 1];
		int[] visited = new int[n + 1];

		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (visited[s] == 1 && num[s] != c) {
				System.out.println(-1);
				return;
			}
			num[s] = c;
			visited[s] = 1;
		}

		int ans = 0;
		for (int i = 1; i < num.length; i++) {
			ans += num[i] * Math.pow(10, n - i);
		}
		
		if (n > 1 && ans == 0) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}

}
