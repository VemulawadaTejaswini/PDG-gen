import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int negativeX = 0;
		int negativeY = 0;
		if (X < 0) {
			negativeX = -1;
			X = -X;
		}
		if (Y < 0) {
			negativeY = -1;
			Y = -Y;
		}

		int m = getManhattan(0, 0, X, Y);
		if (m % 2 != 0 && K % 2 == 0) {
			System.out.println(-1);
			return;
		}

		// 手数
		int dist = 0;
		int moves = 0;
		while(true) {
			dist += K;
			++moves;
			if (dist > m && (dist - m) % 2 == 0) {
				if (moves == 1 && (dist - m) != 0) {
					moves += 2;
				}
				break;
			}
		}
		System.out.println(moves);

		// 経路
		int[] mX = new int[moves];
		int[] mY = new int[moves];
		if (m < K) {
			// 1手でオーバーするようなとき
			if (moves == 2) {
				// 2手
				mX[0] = 0;
				mY[0] = K;
				mX[1] = X;
				mY[1] = Y;
			} else {
				// 3手
				mX[0] = 0;
				mY[0] = 0;
				mX[1] = 0;
				mY[1] = 0;
				mX[2] = X;
				mY[2] = Y;
			}
		} else {

		}

		int idx = 0;
		for (idx = 0; idx < moves; idx++) {
			System.out.print(mX[idx]);
			System.out.print(" ");
			System.out.print(mY[idx]);
			System.out.println();
		}

	}

	public static int getManhattan(int x1, int y1, int x2, int y2) {
		int m = 0;
		m += (x1 < x2) ? x2 - x1 : x1 - x2;
		m += (y1 < y2) ? y2 - y1 : y1 - y2;
		return m;
	}
}
