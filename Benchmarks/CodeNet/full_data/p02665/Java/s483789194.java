import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N + 1];
		int div = 0;
		for (int i = 0; i < N + 1; i++) {
			input[i] = sc.nextInt();
			div += input[i];
		}
		div--;
		int nowTop = 1 - input[0];
		int numOfTop = nowTop;

		for (int i = 0; i < N; i++) {
			if (i != N - 1 && nowTop == 0) {
				System.out.println(-1);
				System.exit(0);
			}
			if (nowTop < 0) {
				System.out.println(-1);
				System.exit(0);
			}

			if (div > 0) {
				// 可能な限り分ける
				int nowDiv = Math.min(nowTop, div);
				div -= nowDiv;
				nowTop += nowDiv;
				numOfTop += nowTop;
				// 分岐できない頂点を除去
				nowTop -= input[i + 1];
			} else {
				// 分けない
				numOfTop += nowTop;
				// 分岐できない頂点を除去
				nowTop -= input[i + 1];
			}
		}
		if (nowTop == 0) {
			System.out.println(numOfTop);
		} else {
			System.out.println(-1);
		}
	}

}
