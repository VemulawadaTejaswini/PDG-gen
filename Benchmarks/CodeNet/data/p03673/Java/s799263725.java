import java.util.ArrayList;
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
			List<Integer> list = new ArrayList<>(count);
			list.add(cin.nextInt());

			boolean fr;
			if (count % 2 == 0) {
				fr = true;
			} else {
				fr = false;
			}

			while (cin.hasNext()) {
				if (fr) {
					list.add(0, cin.nextInt());
					fr = false;
				} else {
					list.add(cin.nextInt());
					fr = true;
				}

			}

			System.out.print(list.get(0));

			for (int i = 1; i < count; i++) {
				System.out.print(" " + list.get(i));
			}
			System.out.println("");
		} finally {
		}
	}

}
