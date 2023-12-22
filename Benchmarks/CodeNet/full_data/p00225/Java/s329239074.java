import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] wc = new int[26];
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				if (str.length() == 1) {
					wc[str.charAt(0) % 26]++;
				} else {
					wc[str.charAt(0) % 26]++;
					wc[str.charAt(str.length() - 1) % 26]++;
				}
			}
			boolean flag = true;
			for (int i = 0; i < 26; i++) {
				if (wc[i] == 0)
					continue;
				if (wc[i] % 2 != 0) {
					flag = false;
					break;
				}
			}
			System.out.println(flag ? "OK" : "NG");
		}
	}
}