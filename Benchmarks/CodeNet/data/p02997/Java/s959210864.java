import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = (n - 2) * (n - 1) / 2 - k;
		if (count < 0) {
			System.out.println(-1);
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(n - 1 + count).append("\n");
		for (int i = 2; i <= n; i++) {
			sb.append(1).append(" ").append(i).append("\n");
		}
		for (int i = 2; i < n && count > 0; i++) {
			for (int j = i + 1; j <= n && count > 0; j++) {
				sb.append(i).append(" ").append(j).append("\n");
				count--;
			}
		}
		System.out.print(sb);
	}
}
