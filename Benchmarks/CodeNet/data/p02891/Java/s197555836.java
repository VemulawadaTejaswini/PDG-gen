import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			int length = S.length();
			int K = sc.nextInt();
			if (length == 1) {
				System.out.print(K - 1);
				return;
			}
			char head = S.charAt(0);
			boolean[] bls = new boolean[length];
			char tail = S.charAt(length - 1);
			long eachCount = 0;
			char last = S.charAt(0);
			for (int i = 1; i < length; i++) {
				if (S.charAt(i) == last && bls[i - 1] == false) {
					bls[i] = true;
					eachCount++;
				}
				last = S.charAt(i);
			}
			long ans = 0;
			ans += eachCount * K;
			if (head == tail && bls[length - 1] == false) {
				ans += K - 1;
			}
			System.out.print(ans);
		}
	}
}