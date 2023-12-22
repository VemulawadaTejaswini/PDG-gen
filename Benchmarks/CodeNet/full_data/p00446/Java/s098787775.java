
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			NavigableSet<Integer> taro = new TreeSet<Integer>();
			NavigableSet<Integer> hana = new TreeSet<Integer>();
			for (int i = 0; i < n; i++)
				taro.add(scanner.nextInt());
			for (int i = 1; i <= n * 2; i++)
				hana.add(i);
			hana.removeAll(taro);
			NavigableSet<Integer> pc = taro;
			Integer table = null;
			while (!taro.isEmpty() && !hana.isEmpty()) {
				if (table == null)
					table = pc.pollFirst();
				else {
					if ((table = pc.higher(table)) != null)
						pc.remove(table);
				}
				pc = pc.equals(taro) ? hana : taro;
			}
			System.out.println(hana.size());
			System.out.println(taro.size());
		}
	}
}