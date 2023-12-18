import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int l = stdIn.nextInt();
		int n = stdIn.nextInt();
		List<Integer> x = new ArrayList<Integer>(n);
		List<Integer> y = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++){
			int z = stdIn.nextInt();
			x.add(z);
			y.add(l - z);
		}
		
		int w = 0;
		while (x.isEmpty() == false) {
			int m = x.size();
			int u = 0;
			for (int j = 0; j < m; j++) {
				if (x.get(j) > y.get(m - 1 - j)) {
					u = x.get(0);
					x.remove(0);
					y.remove(0);
					for (int k = 0; k < m - 1; k++) {
						x.set(k, x.get(k) - u);
						y.set(k, y.get(k) + u);
					}
					break;
				}
				else if (x.get(j) < y.get(m - 1 - j)) {
					u = y.get(m - 1);
					x.remove(m - 1);
					y.remove(m - 1);
					for (int k = 0; k < m - 1; k++) {
						x.set(k, x.get(k) + u);
						y.set(k, y.get(k) - u);
					}
					break;
				}
				else
					continue;
			}
			w = w + u;
		}
		System.out.println(w);
	}
}