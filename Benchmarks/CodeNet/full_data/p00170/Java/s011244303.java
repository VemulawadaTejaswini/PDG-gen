
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Food {
	String name;
	int w;
	int s;

	public Food(String name, int w, int s) {
		this.name = name;
		this.w = w;
		this.s = s;
	}

}

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int max = 0;
			List<Food> list = new ArrayList<Food>();
			for (int i = 0; i < n; i++) {
				String l = scanner.next();
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				list.add(new Food(l, a, b));
				max += a;
			}
			for (int i = 0; i < n; i++) {
				int l = 0;
				int k = 0;
				for (int j = 0; j < list.size(); j++) {
					int m = max - list.get(j).w;
					int ss = list.get(j).s;
					if (m <= ss) {
						if (list.get(j).w > k) {
							k = list.get(j).w;
							l = j;
						}
					}
				}
				max -= list.get(l).w;
				System.out.println(list.get(l).name);
				list.get(l).s = -10;
				list.get(l).w = 0;
			}
		}
	}

}