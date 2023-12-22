import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int[] as = new int[n];
		for (int i = 0; i < n; i++) {
			as[i] = in.nextInt();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = n - 1; 0 <= i; i--) {
			sb.append(as[i]).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}