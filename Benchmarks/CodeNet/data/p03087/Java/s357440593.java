import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int l[] = new int[Q];
		int r[] = new int[Q];

		for (int i = 0; i < Q; i ++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int fetchCount[] = new int [N];
		Arrays.fill(fetchCount, 0);
		for (int i = 1; i < N; i++) {
			if ((String.valueOf(S.charAt(i - 1)) + String.valueOf(S.charAt(i))).equals("AC")) {
				fetchCount[i] = 1;
			}
		}

		for (int i = 0; i < Q; i ++) {
			int sum = 0;
			for (int j = l[i]; j < r[i]; j++) {
				sum += fetchCount[j];
			}
			System.out.println(sum);
		}
	}
}