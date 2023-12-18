import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next();
		int s, g, idx;
		int[] a = new int[str.length() - 1];
		String bin;
		long ans = 0;
		for (int i = 0; i < Math.pow(2, str.length() - 1); i++) {
			bin = Integer.toBinaryString(i);
			for (int j = 0; j < bin.length(); j++) {
				a[j] = bin.charAt(bin.length() - j - 1) - '0';
			}
			idx = 0;
			for (int j = 0; j < str.length() - 1; j++) {
				if (a[j] == 1) {
					s = j;
					ans += Integer.valueOf(str.substring(idx, s + 1));
					idx = s + 1;
				}

			}
			ans += Long.valueOf(str.substring(idx, str.length()));
		}
		System.out.println(ans);
	}
}