import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		StringBuilder sb = new StringBuilder();
		for (int i = n - 1; i >= 0; i -= 2) {
			sb.append(a[i]).append(" ");
		}
		int start = 0;
		if (n % 2 == 1) {
			start = 1;
		}
		for (int i = start; i < n; i += 2) {
			sb.append(a[i]).append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
