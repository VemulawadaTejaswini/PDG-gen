import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		int[] diff = new int[n];
		int tot = 0;

		for (int i=0; i<n; i++) {
			v[i] = sc.nextInt();
		}

		for (int i=0; i<n; i++) {
			diff[i] = v[i] - sc.nextInt();
			if (diff[i] > 0) {
				tot += diff[i];
			}
		}

		System.out.println(tot);
	}
}

