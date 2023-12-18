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

		boolean flg = false;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] + a[i + 1] >= l) {
				flg = true;
				break;
			}
		}
		if (flg) {
			System.out.println("Possible");
			int x = 0;
			int y = n - 1;
			while (x < y) {
				if (a[x] < a[y]) {
					System.out.println(x + 1);
					x++;
				} else {
					System.out.println(y);
					y--;
				}
			}
		} else {
			System.out.println("Impossible");
		}
	}
}
