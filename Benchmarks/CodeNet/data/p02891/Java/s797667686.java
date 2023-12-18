import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			int length = S.length();
			int K = sc.nextInt();
			if (length == 1) {
				System.out.print(K / 2);
				return;
			}
			char head = S.charAt(0);
			boolean[] bls = new boolean[length];
			char tail = S.charAt(length - 1);
			long firstCount = 0;
			char last = S.charAt(0);
			for (int i = 1; i < length; i++) {
				if (S.charAt(i) == last && bls[i - 1] == false) {
					bls[i] = true;
					firstCount++;
				}
				last = S.charAt(i);
			}
			if (K == 1) {
				System.out.println(firstCount);
				return;
			}
			long count = 0;
			boolean[] bls2 = new boolean[length];
			if (head == tail && bls[length - 1] == false) {
				bls2[0] = true;
				count++;
			}
			last = S.charAt(0);
			for (int i = 1; i < length; i++) {
				if (S.charAt(i) == last && bls2[i - 1] == false) {
					bls2[i] = true;
					count++;
				}
				last = S.charAt(i);
			}
			if (K == 2) {
				System.out.println(firstCount + count);
				return;
			}
			long count3 = 0;
			bls = new boolean[length];
			if (head == tail && bls2[length - 1] == false) {
				bls[0] = true;
				count3++;
			}
			last = S.charAt(0);
			for (int i = 1; i < length; i++) {
				if (S.charAt(i) == last && bls[i - 1] == false) {
					bls[i] = true;
					count3++;
				}
				last = S.charAt(i);
			}
			if (bls[length - 1] == bls2[length - 1] && head == tail) {
				System.out.println(firstCount + count + count3 * (K - 2));
				return;
			}

			long num3 = (K - 1) / 2;
			long num2 = K - 1 - num3;

			long ans = firstCount + count * (num2) + count3 * num3;
			System.out.print(ans);
		}
	}
}