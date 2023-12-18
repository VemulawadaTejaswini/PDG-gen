import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String[] s = new String[N];
		int[][] smap = new int[N][26];
		for (int i = 0; i < N; i++) {
			s[i] = sc.nextLine();

			for (int k = 0; k < 10; k++) {
				char c = s[i].substring(k, k + 1).charAt(0);
				smap[i][Character.getNumericValue(c) - 10]++;
			}
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (Arrays.equals(smap[i], smap[j])) cnt++;
			}
		}

		System.out.println(cnt);
	}
}