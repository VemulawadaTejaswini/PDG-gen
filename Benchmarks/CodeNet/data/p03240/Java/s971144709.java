
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		List<Info> list = new ArrayList<Info>();
		int minX = 101;
		int minY = 101;
		int maxX = -1;
		int maxY = -1;
		for (int i = 0; i < a; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			list.add(new Info(x, y, h));
			minX = Math.min(minX, x);
			minY = Math.min(minY, y);
			maxX = Math.max(maxX, x);
			maxY = Math.max(maxY, y);
		}
		boolean flag = true;
		for (int x = minX; x <= maxX; x++) {
			for (int y = minY; y <= maxY; y++) {
				Info info = list.get(0);
				int distance = Math.abs(x - info.x) + Math.abs(y - info.y);
				long height = distance + info.h;
				flag = true;
				for (Info i : list) {
					int dis = Math.abs(x - i.x) + Math.abs(y - i.y);

					if (height != dis + i.h && height - dis >= 0) {
						flag = false;
						break;
					}
				}

				if (flag) {
					System.out.println(x + " " + y + " " + height);
					break;
				}
			}
			if (flag) {
				break;
			}
		}

	}
}

class Info {
	int x;
	int y;
	long h;

	public Info(int x, int y, long h) {
		super();
		this.x = x;
		this.y = y;
		this.h = h;
	}
}
