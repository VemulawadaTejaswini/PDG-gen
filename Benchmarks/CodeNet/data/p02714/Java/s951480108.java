import java.util.*;

public class Main {

	static List<Integer> R = new ArrayList<Integer>();
	static List<Integer> G = new ArrayList<Integer>();
	static List<Integer> B = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] c = S.toCharArray();
		sc.close();

		for (int i = 0; i < N; i++) {
			if (c[i] == 'R') {
				R.add(i);
			} else if (c[i] == 'G') {
				G.add(i);
			} else {
				B.add(i);
			}
		}

		long ng = 0;

		for (int i = 0; i < N - 2; i++) {
			char first = c[i];

			for (int j = i + 1; j < N - 1; j++) {
				if (c[j] == first) {
					continue;
				}
				char second = c[j];
				int d = j - i;

				if (j + d < N) {
					if (c[j + d] != first && c[j + d] != second) {
						ng++;
					}
				}
			}
		}

		long ans = R.size() * G.size() * B.size() - ng;
		System.out.println(ans);
	}
}
