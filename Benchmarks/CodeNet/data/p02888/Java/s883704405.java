import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = in.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int j2 = j + 1; j2 < n; j2++) {
					if (l[i] < (l[j] + l[j2]) && l[j] < (l[i] + l[j2]) && l[j2] < (l[j] + l[i])) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}