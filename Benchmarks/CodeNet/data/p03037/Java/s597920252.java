import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] l = new int[m];
		int[] r = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = Integer.parseInt(sc.next());
			r[i] = Integer.parseInt(sc.next());
		}
		boolean[] space = new boolean[n];
		for (int i = 0; i < n; i++) {
			space[i] = true;
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l[i] - 1; j++) {
				space[j] = false;
			}
			for (int j = r[i]; j < n; j++) {
				space[j] = false;
			}
		}

		int count = 0;
		for (boolean b : space) {
			if (b) {
				count++;
			}
		}
		System.out.println(count);

	}

}
