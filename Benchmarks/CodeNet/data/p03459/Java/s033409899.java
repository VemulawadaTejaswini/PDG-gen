import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 市松模様
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n_hope = scan.nextInt();
		int k = scan.nextInt();

		// 希望分ループ
		int ok_count = 0;
		List<Zahyo> zahyo = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		for (int i=0; i<n_hope; i++) {
			input(scan, k, zahyo);
		}
		judgeAndDisplay(zahyo, k);
	}

	// 座標と色を保持するようのクラス
	static class Zahyo {
		int x;
		int y;
		String color;
		Zahyo(int x, int y, String color) {
			this.x = x;
			this.y = y;
			this.color = color;
		}
	}

	protected static void input(Scanner scan, int k, List<Zahyo> zahyo) {
		int x = scan.nextInt();
		int y = scan.nextInt();
		String color = scan.next();
		// 色は黒で統一
		if (color.equals("W")) {
			y += k;
			color = "B";
		}
		Zahyo aZahyo = new Zahyo(x, y, color);
		zahyo.add(aZahyo);
	}

	protected static void judgeAndDisplay(List<Zahyo> zahyo, int k) {
		int count1 = 0;
		int count2 = 0;

		for (Zahyo aZahyo : zahyo) {
			// 市松模様の長さを２グループに分ける
			int tmpX = aZahyo.x%(2*k);
			int tmpY = aZahyo.y%(2*k);

			// 左下、右上のグループは同一グループ
			if ((tmpX < k && tmpY < k) || (tmpX >= k && tmpY >= k)) {
				count1++;
			}
			// 左上、右下のグループは同一グループ
			else {
				count2++;
			}
		}

		if (count1 > count2) {
			System.out.println(count1);
		}
		else {
			System.out.println(count2);
		}
	}
}
