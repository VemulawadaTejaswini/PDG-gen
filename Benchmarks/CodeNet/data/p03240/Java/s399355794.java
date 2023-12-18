import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int x[] = new int[n];
		int y[] = new int[n];
		int H[] = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			H[i] = scanner.nextInt();

		}

		List<Integer> cx = new ArrayList<>();
		List<Integer> cy = new ArrayList<>();
		List<Integer> h = new ArrayList<>();
		int ind = 0;
		for (int d = 0; d < n; d++) {
			if (H[d] != 0) {
				ind = d;
				break;
			}
		}
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {

				int k = H[ind] + Math.abs(x[ind] - i) + Math.abs(y[ind] - j);

				if (k >= 1) {
					cx.add(i);
					cy.add(j);
					h.add(k);
				}
			}
		}

		for (int j = 0; j < cx.size(); j++) {
			boolean b = true;
			int Cx = cx.get(j);
			int Cy = cy.get(j);
			int ha = h.get(j);
			for (int i = 0; i < n; i++) {
				if (H[i] == 0) {
					continue;
				}
				if (H[i] == ha - Math.abs(x[i] - Cx) - Math.abs(y[i] - Cy)) {
					continue;
				} else {
					b = false;
					break;
				}
			}
			if (b) {
				System.out.println(Cx + " " + Cy + " " + ha);
				return;
			}
		}

	}
}
