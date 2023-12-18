import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		char[] c = sc.next().toCharArray();
		int[] counts = new int[Q];
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			boolean aFlag = false;
			int count = 0;
			for (int j = l-1; j < r; j++) {
				if (!aFlag && c[j] == 'A') {
					aFlag = true;
				} else if (aFlag) {
					if (c[j] == 'C') {
						count++;
					}
					aFlag = false;
				}
			}

			counts[i] = count;

		}

		for (int k : counts) {
			System.out.println(k);
		}
	}

}