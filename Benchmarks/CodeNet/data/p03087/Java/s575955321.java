import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		char[] c = sc.next().toCharArray();
		int[] counts = new int[N];
		int[] results = new int[Q];
		boolean aFlag = false;
		int count = 0;
		for (int j = 0; j < N; j++) {
			if (c[j] == 'A') {
				aFlag = true;
			} else if (aFlag) {
				if (c[j] == 'C') {
					count++;
				}
				aFlag = false;
			}
			counts[j] = count;
		}
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int forL = counts[l-1];
			int forR = counts[r-1];

			results[i] = forR - forL;

		}

		for (int k : results) {
			System.out.println(k);
		}
	}

}