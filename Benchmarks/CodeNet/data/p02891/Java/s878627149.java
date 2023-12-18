import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		long K = in.nextInt();
		int fCount = 0;
		int count = 1;
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(0) != S.charAt(i)) {
				break;
			}
			count++;
		}
		fCount = count;
		int lCount = 0;
		count = 1;
		for (int i = S.length() - 2; i > fCount - 1; i--) {
			if (S.charAt(S.length() - 1) != S.charAt(i)) {
				break;
			}
			count++;
		}
		lCount = count;
		int mCount = 0;
		count = 1;
		for (int i = (fCount / 2) + 1; i < S.length() - lCount - 1;) {
			for (int j = i + 1; j < S.length() - lCount; j++) {
				if (S.charAt(i) != S.charAt(j)) {
					i++;
					break;
				}
				i++;
				count++;
			}
			mCount += count / 2;
			count = 1;
		}
		long ans = 0;
		if (S.charAt(0) == S.charAt(S.length() - 1) && fCount % 2 != 0 && lCount % 2 != 0) {
			ans = ((fCount / 2) + mCount + (lCount / 2) + 1) * K - 1;
		} else {
			ans = ((fCount / 2) + mCount + (lCount / 2)) * K;
		}
		System.out.println(ans);
		in.close();
	}
}