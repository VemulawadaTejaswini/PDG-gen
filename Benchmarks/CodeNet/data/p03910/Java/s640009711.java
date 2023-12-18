import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int idx = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (sum >= n) {
				idx = i;
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = idx; i > 0; i--) {
			if (sum - n != i) {
				sb.append(i).append("\n");
			}
		}
		System.out.print(sb);
	}
}
