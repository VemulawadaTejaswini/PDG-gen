import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[10000000];
		int sum = 0, cnt = 0;
		while (sum <= n) {
			cnt++;
			a[cnt] = cnt;
			sum += cnt;
		}
		a[sum - n] = 0;
		for (int i = 1; i <= n; i++) {
			if (a[i] >= 1) {
				sb.append(i + "\n");
			}
		}
		System.out.print(sb);
	}
}
