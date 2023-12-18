import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		long K = scanner.nextLong();
		scanner.close();
		char[] charArray = S.toCharArray();
		long cnt = 0;

		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i - 1] == charArray[i]) {
				charArray[i] = '0';
				cnt++;
			}
		}
		if (charArray[0] == charArray[charArray.length - 1]) {
			cnt *= K;
			cnt += bonus(S, K);

		} else {
			cnt *= K;
		}
		if (isSameChar(S)) {
			long tmp = K * S.length();
			if (tmp % 2 == 1) {
				tmp--;
			}
			System.out.println(tmp / 2);
		} else if (charArray.length != 1) {
			System.out.println(cnt);
		} else if (K == 1) {
			System.out.println(0);
		} else {
			if (K % 2 == 1) {
				K++;
			}
			System.out.println(K / 2);
		}

	}

	public static boolean isSameChar(String S) {
		boolean flag = true;
		char[] charArray = S.toCharArray();
		char tmp = charArray[0];
		for (int i = 0; i < charArray.length; i++) {
			if (tmp != charArray[i]) {
				flag = false;
			}
		}
		return flag;
	}

	public static long bonus(String S, long K) {
		int count_a = 1;
		int count_b = 1;
		char[] charArray = S.toCharArray();
		char tmp = charArray[0];
		boolean flag = isSameChar(S);
		if (!flag) {
			for (int i = 1; i < charArray.length; i++) {
				if (tmp == charArray[i]) {
					count_a++;
				} else {
					break;
				}
			}
			for (int i = charArray.length - 2; 0 <= i; i--) {
				if (tmp == charArray[i]) {
					count_b++;
				} else {
					break;
				}
			}
		} else {
			int middle = charArray.length / 2;
			for (int i = 1; i < middle; i++) {
				if (tmp == charArray[i]) {
					count_a++;
				} else {
					break;
				}
			}
			for (int i = charArray.length - 2; middle <= i; i--) {
				if (tmp == charArray[i]) {
					count_b++;
				} else {
					break;
				}
			}
		}
		int count = count_a + count_b;
		if (count % 2 == 0) {
			return K - 1;
		} else {
			return 0;
		}
	}
}