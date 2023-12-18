import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] str = scn.nextLine().toCharArray();
		long K = scn.nextInt();

		int len = 0;
		int start = 0;
		boolean all = true;
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != str[i + 1]) {
				start = i + 1;
				all = false;
			}
		}
		long ans = 0;
		if (all) {

			System.out.println((K * str.length) / 2);

			return;
		}
		len = 1;
		for (int i = start; i < start + str.length; i++) {
			if (str[i % str.length] == str[(i + 1) % str.length]) {
				len++;
			} else {
				ans += len / 2;
				len = 1;
			}
		}
		ans += len / 2;

		ans *= K - 1;

		for (int i = 0; i < start; i++) {
			if (str[i] == str[i + 1]) {
				len++;
			} else {
				ans += len / 2;
				len = 1;
			}
		}
		for (int i = start; i < str.length - 1; i++) {
			if (str[i] == str[i + 1]) {
				len++;
			} else {
				ans += len / 2;
				len = 1;
			}
		}
		ans += len / 2;

		System.out.println(ans);
	}

}
