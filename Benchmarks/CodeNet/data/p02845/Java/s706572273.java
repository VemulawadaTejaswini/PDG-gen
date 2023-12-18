import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int m = 1000000007;
		long answer = 1;
		int[] d = new int[3];
		Arrays.fill(d, -1);
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			int ix = 0;
			for (int j = 0; j < d.length; j++) {
				if (d[j] + 1 == a[i]) {
					c++;
					ix = j;
				}
			}

			answer = (answer * c) % m;
			d[ix]++;
		}

		System.out.println(answer);
	}
}
