import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int result = 0;
		for (int i = 0; i < N - 2; i++) {
			char ci = S.charAt(i);
			for (int j = i + 1; j < N - 1; j++) {
				char cj = S.charAt(j);
				if (ci == cj) {
					continue;
				}
				for (int k = j + 1; k < N; k++) {
					char ck = S.charAt(k);
					if((ci != ck) && (cj != ck) && ((j - i) != (k - j))) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}

}
