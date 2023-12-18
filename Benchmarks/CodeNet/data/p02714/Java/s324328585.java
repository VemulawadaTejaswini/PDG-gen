import java.util.*;

public class Main {

	static List<Long> R = new ArrayList<Long>();
	static List<Long> G = new ArrayList<Long>();
	static List<Long> B = new ArrayList<Long>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] c = S.toCharArray();
		sc.close();

		// 一周してRGBがどこにあるかを判定
		for (int i = 0; i < N; i++) {
			if (c[i] == 'R') {
				R.add((long) i);
			} else if (c[i] == 'G') {
				G.add((long) i);
			} else {
				B.add((long) i);
			}
		}

		// NGを判定する
		long ng = 0;
		for (int i = 0; i < N - 2; i++) {
			char first = c[i];

			for (int j = i + 1; j < N - 1; j++) {
				if (c[j] == first) {
					continue;
				}
				char second = c[j];
				int d = j - i;

				if (j + d < N && c[j + d] != first && c[j + d] != second) {
					ng++;
				}
			}
		}

		long ans = (R.size() * G.size() * B.size()) - ng;
		System.out.println(ans);
	}
}
