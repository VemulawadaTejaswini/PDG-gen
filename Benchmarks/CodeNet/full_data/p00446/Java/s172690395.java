
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
			NavigableSet<Integer> hanako = new TreeSet<Integer>();
			for (int i = 0; i < n; i++)
				taro.add(scanner.nextInt());
			for (int i = 1; i <= n * 2; i++)
				if (!taro.contains(i))
					hanako.add(i);

			boolean flag = true;
			int a = 0;
			while (!taro.isEmpty() && !hanako.isEmpty()) {
				if (flag)
					a = taro.pollFirst();
				else
					a = hanako.pollFirst();
				while (!taro.isEmpty() && !hanako.isEmpty()) {
					if (flag) {
						if (hanako.higher(a) == null) {
							break;
						} else {
							a = hanako.higher(a);
							hanako.remove(a);
							flag = false;
						}
					} else {
						if (taro.higher(a) == null)
							break;
						else {
							a = taro.higher(a);
							taro.remove(a);
							flag = true;
						}

					}

				}
			}
			System.out.println(hanako.size());
			System.out.println(taro.size());
		}
	}
}