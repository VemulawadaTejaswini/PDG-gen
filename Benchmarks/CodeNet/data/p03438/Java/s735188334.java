import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long suma = 0;
		long sumb = 0;
		long sumab = 0;
		long sumba = 0;
		for (int i = 0; i < n; i++) {
			suma += a[i];
			sumb += b[i];
			if (a[i] > b[i]) {
				sumab += a[i] - b[i];
			} else {
				sumba += b[i] - a[i];
			}
		}

		long d = sumb - suma;
		if (sumab <= d && sumba <= d * 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
