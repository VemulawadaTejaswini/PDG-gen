import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			if (n == 0 && m == 0)
				return;
			int[] h = new int[n];
			for (int i = 0; i < n; i++)
				h[i] = Integer.parseInt(sc.next());
			int[] w = new int[m];
			for (int i = 0; i < m; i++)
				w[i] = Integer.parseInt(sc.next());
			int ans = 0;
			ArrayList<Integer> a = new ArrayList<>();
			ArrayList<Integer> b = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int H = 0;
				for (int j = i; j >= 0; j--) {
					H += h[j];
					a.add(H);
				}
			}
			for (int k = 0; k < m; k++) {
				int W = 0;
				for (int l = k; l >= 0; l--) {
					W += w[l];
					b.add(W);
				}
			}
			for (int i = 0; i < a.size(); i++) {
				for (int j = 0; j < b.size(); j++) {
					if (a.get(i) == b.get(j))
						ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
