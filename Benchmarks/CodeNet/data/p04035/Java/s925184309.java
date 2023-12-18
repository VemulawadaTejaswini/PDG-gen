import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int l = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int idx = -1;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] + a[i + 1] >= l) {
				idx = i;;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("Impossible");
		} else {
			System.out.println("Possible");
			for (int i = 0; i < idx; i++) {
				System.out.println(i + 1);
			}
			for (int i = n - 2; i >= idx; i--) {
				System.out.println(i + 1);
			}
		}
	}
}
