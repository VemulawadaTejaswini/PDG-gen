
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// ABC062
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveB();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		List<Integer> a = Arrays.asList(0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0);
		if (a.get(x - 1) == a.get(y - 1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int x = sc.nextInt();
		System.out.println();
		// 縦軸
		for (int i = 0; i < (y + 2); i++) {
			// 最初の行じゃないかつ、最終行じゃない
			if (0 == i || y + 1 == i) {
				// 調整分
				System.out.println();
				// 「#」を文字数＋２(前後分)出力
				for (int j2 = 0; j2 < x + 2; j2++) {
					System.out.print("#");
				}
				// 空の出力があるから吐き出す
				sc.nextLine();
			} else {
				// 改行してからスタート
				System.out.print("#" + sc.nextLine() + "#");
			}
		}
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveF() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

}