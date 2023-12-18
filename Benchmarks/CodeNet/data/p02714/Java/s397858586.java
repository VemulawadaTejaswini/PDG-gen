import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int nR = 0;
		int nG = 0;
		int nB = 0;
		for (int i = 0; i < N; i++) {
			switch (S.charAt(i)) {
				case 'R':
					nR++;
					break;
				case 'G':
					nG++;
					break;
				case 'B':
					nB++;
					break;
			}
		}
		int err = 0;
		for (int j = 1; j < N - 1; j++) {
			for (int i = 1; i < Math.min(j + 1, N - j); i++) {
				char Si = S.charAt(j - i);
				char Sj = S.charAt(j);
				char Sk = S.charAt(j + i);
				if ((Si != Sj) && (Si != Sk) && (Sj != Sk)) {
					err++;
				}
			}
		}
		System.out.println(nR * nG * nB - err);
	}

}
