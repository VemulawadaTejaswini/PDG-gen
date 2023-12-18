import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		int[] sum = new int[s.length()];
		for (int i = 1; i < s.length(); i++) {
			sum[i] = sum[i - 1];
			if (s.charAt(i) == 'C' && s.charAt(i - 1) == 'A') sum[i]++;
		}

		while (q-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(sum[r - 1] - sum[l - 1]);
		}
	}
}
