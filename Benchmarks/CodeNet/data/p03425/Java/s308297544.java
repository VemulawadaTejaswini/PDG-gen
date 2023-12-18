import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();scan.nextLine();
		String[] S = new String[n];
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextLine();
		}
		int[] s = new int[5];
		for (int i = 0; i < n; i++) {
			if (S[i].charAt(0) == 'M') s[0]++;
			else if (S[i].charAt(0) == 'A') s[1]++;
			else if (S[i].charAt(0) == 'R') s[2]++;
			else if (S[i].charAt(0) == 'C') s[3]++;
			else if (S[i].charAt(0) == 'H') s[4]++;
		}

		long ans = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				for (int k = j + 1; k < 5; k++) {
					ans += (long)(s[i]*s[j]*s[k]);
				}
			}
		}
		System.out.println(ans);
	}
}
