
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		List<Info> list = new ArrayList<Info>();
		boolean flag = true;
		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				flag = true;
				int distance;
				long height = 0;
				for (Info i : list) {
					if (i.h != 0) {
						distance = Math.abs(x - i.x) + Math.abs(y - i.y);
						height = distance + i.h;
						break;
					}
				}
				for (Info i : list) {
					int dis = Math.abs(x - i.x) + Math.abs(y - i.y);
					if(height - dis < 0 && i.h == 0) {

					} else if (height != dis + i.h) {
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
