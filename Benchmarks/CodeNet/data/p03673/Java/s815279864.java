import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.solve();
	}

	void solve() throws Exception {
		try (Scanner cin = new Scanner(System.in)) {
			int count = cin.nextInt();
			List<Integer> list = new ArrayList<>();

			while (cin.hasNext()) {
				list.add(cin.nextInt());
				Collections.reverse(list);
			}

			for (int i = 0; i < count; i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(list.get(i));
			}
			System.out.println("");
		} finally {
		}
	}

}
