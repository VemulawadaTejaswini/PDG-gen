import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st1, st2;
		int max, sum;
		int hash1, hash2;

		while (sc.hasNext()) {
			st1 = sc.next();
			st2 = sc.next();
			max = 0;
			hash1 = st1.charAt(0) - 'A' + 1;
			hash2 = st2.charAt(0) - 'A' + 1;

			for (int i = 0; i + max < st1.length(); i++) {
				if (0 < i) {
					hash1 = hashRecreate(st1, i, max + 1, hash1);
				}
				if (max + 1 < st2.length()) {
					hash2 = hashInit(st2, max + 1);
				}
				for (int j = 0; j + max < st2.length(); j++) {
					if (0 < j) {
						hash2 = hashRecreate(st2, j, max + 1, hash2);
					}
					if (st1.charAt(i) == st2.charAt(j) && hash1 == hash2) {
						sum = f(st1, st2, i, j);
						if (max < sum) {
							for (int k = 0; k < sum - max; k++) {
								if (i + max + k + 1 < st1.length() && j + max + k + 1 < st2.length()) {
									hash1 += (st1.charAt(i + max + k + 1) - 'A' + 1);
									hash2 += (st2.charAt(j + max + k + 1) - 'A' + 1);
								}
							}
							max = sum;
						}
					}
				}
			}
			System.out.println(max);
		}
	}

	public static int f(String st1, String st2, int index1, int index2) {
		int count = 0;

		for (int i = 0; index1 + i < st1.length() && index2 + i < st2.length(); i++) {
			if (st1.charAt(index1 + i) == st2.charAt(index2 + i)) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	public static int hashRecreate(String st, int startIndex, int length, int hash) {
		hash -= (st.charAt(startIndex - 1) - 'A' + 1);
		hash += (st.charAt(startIndex + length - 1) - 'A' + 1);
		if (hash < 0) {
			hash += 255;
		}

		return hash;
	}

	public static int hashInit(String st, int length) {
		int hash = st.charAt(0) - 'A' + 1;

		for (int i = 1; i < length; i++) {
			hash += (st.charAt(i) - 'A' + 1);
		}
		if (hash < 0) {
			hash += 255;
		}

		return hash;
	}
}