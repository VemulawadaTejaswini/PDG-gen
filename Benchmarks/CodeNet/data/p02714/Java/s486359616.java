
public class Main {

	final private int N;
	final private String S;

	Main(int n, String s) {
		N = n;
		S = s;
	}

	public long solve() {
		long cnt = 0;
		for (int i = 0; i < S.length(); i++) {
			char si = S.charAt(i);
			if (isRGB(si)) {
				for (int j = i + 1; j < S.length(); j++) {
					char sj = S.charAt(j);
					if ((si != sj) && isRGB(sj)) {
						for (int k = j + 1; k < S.length(); k++) {
							char sk = S.charAt(k);
							if ((j - i != k - j) && (si != sk) && (sj != sk)
									&& isRGB(sk)) {
								cnt++;
							}
						}
					}
				}
			}
		}
		return cnt;
	}

	public boolean isRGB(char in) {
		switch (in) {
		case 'R':
		case 'G':
		case 'B':
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		System.out.println(new Main(sc.nextInt(), sc.next()).solve());
	}

}