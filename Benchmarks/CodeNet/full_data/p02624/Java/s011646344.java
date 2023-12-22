import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			long[] arr = new long[n + 1];
			for (int i = 2; i <= n; i++) {
				int j = 1;
				int tmp = i * j;
				while (tmp <= n) {
					arr[tmp] += 1;
					j++;
					tmp = i * j;
				}
			}
			long ans = 0;
			for (int i = 1; i <= n; i++) {
				ans += i * (arr[i] + 1);
			}
			System.out.print(ans);
		}
	}
}