import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 市松模様
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n_hope = scan.nextInt();
		int k = scan.nextInt();

		// 希望分ループ
		List<Zahyo> zahyo = new ArrayList<>();
		for (int i=0; i<n_hope; i++) {
			input(scan, k, zahyo);
		}
		judgeAndDisplay(zahyo, k, n_hope);
	}

	// 座標と色を保持するようのクラス
	static class Zahyo {
		int x;
		int y;
//		String color;
//		Zahyo(int x, int y, String color) {
		Zahyo(int x, int y) {
			this.x = x;
			this.y = y;
//			this.color = color;
		}
	}

	protected static void input(Scanner scan, int k, List<Zahyo> zahyo) {
		int x = scan.nextInt();
		int y = scan.nextInt();
		String color = scan.next();
		// 色は黒で統一
		if (color.equals("W")) {
			y += k;
//			color = "B";
		}
		x = x%(2*k);
		y = y%(2*k);
//		Zahyo aZahyo = new Zahyo(x, y, color);
		Zahyo aZahyo = new Zahyo(x, y);
		zahyo.add(aZahyo);
	}

	protected static void judgeAndDisplay(List<Zahyo> zahyo, int k, int n) {
		int[][] counters = new int[2*k+1][2*k+1];
		int[][] tmpArray = new int[2*k][2*k];
		// 元表を作成
		for (int i=0; i<2*k; i++) {				// 縦
			for (int j=0; j<2*k; j++) {			// 横
				int count = 0;
				for (Zahyo aZahyo : zahyo) {
					if ((j <= aZahyo.x && aZahyo.x < j + k) && (i <= aZahyo.y && aZahyo.y < i + k)
							|| (j + k <= aZahyo.x) && (i + k <= aZahyo.y)) {
						count++;
					}
					else if (j > k && (j+k)%(2*k) > aZahyo.x && (i < aZahyo.y && aZahyo.y < i + k)) {
						count++;
					}
					else if (i > k && (i+k)%(2*k) > aZahyo.y && (j <= aZahyo.x && aZahyo.x < j + k)) {
						count++;
					}
					else if (i > k && (i+k)%(2*k) > aZahyo.y && (j > k && (i+k)%(2*k) > aZahyo.x)) {
						count++;
					}
				}
				tmpArray[j][i] = count;
			}
		}

		// 横に累積和
		for (int i=0; i<2*k; i++) {				// 縦
			for (int j=0; j<2*k; j++) {			// 横
				counters[j+1][i+1] = counters[j][i] + tmpArray[j][i];
			}
		}
		// 縦に累積和
		for (int i=0; i<2*k; i++) {				// 横
			for (int j=0; j<2*k; j++) {			// 縦
				counters[i+1][j+1] = counters[i][j] + tmpArray[i][j];
			}
		}
		int max = 0;
		int tmpMax = 0;
		for (int i=0; i<2*k; i++) {
			for (int j=0; j<2*k; j++) {
				tmpMax = counters[i+1][j+1] - counters[i][j+1] - counters[i+1][j] + counters[i][j];
				max = Math.max(max, tmpMax);
			}
		}
		System.out.println(max);
	}
}