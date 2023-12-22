import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 & (m = in.nextInt()) != 0) {
			List<Integer> h = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int val = in.nextInt();
				int size = h.size();
				for (int j = 0; j < i; j++) {
					h.add(val + h.get(size - i + j));
				}
				h.add(val);
			}
			List<Integer> w = new ArrayList<Integer>();
			for (int i = 0; i < m; i++) {
				int val = in.nextInt();
				int size = w.size();
				for (int j = 0; j < i; j++) {
					w.add(val + w.get(size - i + j));
				}
				w.add(val);
			}
			int counter = 0;
			for (Integer width : w) {
				for (Integer height : h) {
					if (width.compareTo(height) == 0) {
						counter++;
					}
				}
			}
			System.out.println(counter);
		}

	}

}