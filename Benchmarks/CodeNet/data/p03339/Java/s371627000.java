import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		char[] s = sc.nextLine().toCharArray();
		int[] lw = new int[n];
		int[] re = new int[n];
		for (int i = 1; i < n; i++) {
			lw[i] = lw[i - 1] + (s[i - 1] == 'W' ? 1 : 0);
		}
		for (int i = n - 2; i >= 0; i--) {
			re[i] = re[i + 1] + (s[i + 1] == 'E' ? 1 : 0);
		}

		int answer = n - 1;
		for (int i = 0; i < n; i++) {
			answer = Math.min(answer, re[i] + lw[i]);
		}

		System.out.println(answer);
	}
}
