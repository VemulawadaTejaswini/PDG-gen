import java.util.Scanner;
import java.io.*;

class Main {

	static void computeLPSArray(String str, int M, int lps[]) {

		int len = 0;

		int i;

		lps[0] = 0;
		i = 1;

		while (i < M) {
			if (str.charAt(i) == str.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {

					len = lps[len - 1];

				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
	}

	static boolean isRepeat(String str) {

		int n = str.length();
		int lps[] = new int[n];

		computeLPSArray(str, n, lps);

		int len = lps[n - 1];

		return (len > 0 && n % (n - len) == 0) ? true : false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		String txt = sc.nextLine();
		int n = 1;
		for (int i = 0; i < n; i++) {
			if (txt.length() == 1) {
				System.out.println("Yes");
			}

			else if (isRepeat(txt) == true)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
