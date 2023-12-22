import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long[] input = new long[(int) (N + 1)];
		long div = 0;
		for (int i = 0; i < N + 1; i++) {
			input[i] = sc.nextInt();
			div += input[i];
		}
		div--;
		long nowTop = 1 - input[0];
		long numOfTop = 1;

		for (int i = 0; i < N; i++) {
			// 最深部でないのに、アクティブなノードが0になったときの枝切り
			if (i != N - 1 && nowTop == 0) {
				System.out.println(-1);
				System.exit(0);
			}
			// アクティブなノードが0未満の枝切り
			if (nowTop < 0) {
				System.out.println(-1);
				System.exit(0);
			}

			if (div > 0) {
				// 可能な限り分ける
				long nowDiv = Math.min(nowTop, div);
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
