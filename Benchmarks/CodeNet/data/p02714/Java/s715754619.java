import java.util.Scanner;

public class Main {
	public static boolean Triple(String S, int i, int j, int k) {
		if ((S.charAt(i) != S.charAt(j)) && (S.charAt(j) != S.charAt(k)) && (S.charAt(k) != S.charAt(i))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int i, j, k;
		long sum = 0;
		for (i = 0; i < N; i++) {
			for (j = 0; j < i; j++) {
				for (k = 0; k < j; k++) {
					if (j - i != k - j) {
						if (Triple(S, i, j, k) == true) {
							sum++;
						}
					}
				}
			}
		}

		System.out.println(sum);
	}
}
