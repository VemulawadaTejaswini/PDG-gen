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
			int x1 = cin.nextInt();
			int x2 = cin.nextInt();
			int x3 = cin.nextInt();

			List<Integer> list = new ArrayList<>();
			list.add(x1);
			list.add(x2);
			list.add(x3);
			Collections.sort(list);
			System.out.println(list.get(0) + list.get(1));
		} finally {
		}
	}

}
