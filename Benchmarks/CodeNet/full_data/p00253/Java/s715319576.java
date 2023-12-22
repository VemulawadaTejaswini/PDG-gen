
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i <= n; i++)
				list.add(scanner.nextInt());
			for (int i = 0; i <= n; i++) {
				List<Integer> tmp = new ArrayList<>();
				tmp.addAll(list);
				tmp.remove(i);
				if (slove(tmp)) {
					System.out.println(list.get(i));
					break;
				}
			}
		}
	}

	private boolean slove(List<Integer> tmp) {
		int ans = tmp.get(1) - tmp.get(0);
		for (int i = 2; i < tmp.size(); i++)
			if (tmp.get(i) - tmp.get(i - 1) != ans)
				return false;
		return true;
	}
}