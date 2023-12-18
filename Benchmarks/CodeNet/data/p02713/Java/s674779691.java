import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans = 0;
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int K = Integer.parseInt(str);

		for (int i = 1; i <= K; i++) {
			for (int j = i; j <= K; j++) {
				for (int k = j; k <= K; k++) {
					ans += calcGcd(i, j, k);
				}
			}
		}
		System.out.println(ans);
		in.close();
	}

	public static int calcGcd(int i, int j, int k) {// i<j<k
		int p = k, q = j, temp, num = 6;
		if (i == j && j == k) {
			num = 1;
		} else if (i == j || j == k) {
			num = 3;
		}
		while (p % q != 0) {
			temp = p % q;
			p = q;
			q = temp;
		}
		if (i < q) {
			p = q;
			q = i;
		} else {
			p = i;
		}
		while (p % q != 0) {
			temp = p % q;
			p = q;
			q = temp;
		}
		return q * num;
	}

}