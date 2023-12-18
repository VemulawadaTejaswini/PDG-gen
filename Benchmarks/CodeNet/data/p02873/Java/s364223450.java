import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int n = s.length() + 1;

		int[] lt = new int[n];
		int[] gt = new int[n];

		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == '<') {
				lt[i + 1] = lt[i] + 1;
			}
		}
		for (int i = n - 2; i >= 0; i--) {
			if (s.charAt(i) == '>') {
				gt[i] = gt[i + 1] + 1;
			}
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.max(lt[i], gt[i]);
		}
		System.out.println(sum);
	}

}
