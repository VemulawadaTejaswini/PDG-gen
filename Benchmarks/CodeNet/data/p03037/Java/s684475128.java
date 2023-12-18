import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[n];
		int start = 0;
		int end = 0;
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			if (i == 0) {
				start = l[i];
				end = r[i];
			} else {
				if (l[i] > start) {
					start = l[i];
				}
				if (r[i] < end) {
					end = r[i];
				}
			}
		}
		System.out.println(end - start + 1);
	}
}
