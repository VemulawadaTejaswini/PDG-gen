
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		boolean[] tri = new boolean[1000001];
		for (int i = 1; i * (i + 1) / 2 <= 100000; i++) {
			int a = i * (i + 1) / 2;
			tri[a] = true;
		}
		loop: while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int sum = 0;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				list.add(a);
				sum += a;
			}
			if (tri[sum]) {
				int res = 0;
				int R = n;
				while (res <= 10000) {
					if (slove(list)) {
						System.out.println(res);
						continue loop;
					}
					int size = list.size();
					for (ListIterator<Integer> it = list.listIterator(); it
							.hasNext();) {
						int a = it.next();
						if (a == 1)
							it.remove();
						else
							it.set(a - 1);

					}
					list.add(size);

					res++;
				}
			}
			System.out.println(-1);
		}
	}

	private boolean slove(List<Integer> list) {
		for (int i = 0; i < list.size(); i++)
			if (i + 1 != list.get(i))
				return false;
		return true;
	}
}