import java.util.Scanner;

public class Main {

	static int minValue = Integer.MAX_VALUE;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		byte D = scanner.nextByte();
		long G = scanner.nextLong();
		long[] p = new long[D + 1];
		long[] c = new long[D + 1];
		for (byte b = 1; b <= D; b++) {
			p[b] = scanner.nextLong();
			c[b] = scanner.nextLong();
		}
		scanner.close();

		// 最小で何個を解けば目標点数がクリアできるか
		// 同じ点数の問題を解き終えればボーナスあり
		// 低い点数のを全部解けば高い点数のを解くよりも点数が高い可能性あり
		// デカい点数のを解けばボーナス入る前に達成できる可能性もあり

		// 残りの中で一番大きいのを解く個数よりもボーナスが入る個数解く方が得な場合がある
		// なるほど？もうわかんねぇなこれ
		// とりあえずやってみるか

		// 馬鹿正直に高い方から解いてみる -> だめだった
		// 総当たりで解いてみるか

		byte[] bytes = new byte[D];
		for (byte b = 0; D > b; b++) {
			bytes[b] = (byte) (b + 1);
		}

		searcher(bytes, 0, p, c, G);

		int value = 0;
		System.out.print(value);

	}

	static void searcher(byte[] bytes, int value, long[] p, long[] c, long G) {
		for (byte b = 0; bytes.length > b; b++) {
			while (G > 0) {
				p[bytes[b]]--;
				G = G - bytes[b] * 100;
				if (p[bytes[b]] == 0) {
					G = G + c[bytes[b]];
					byte[] bytes_in = new byte[bytes.length - 1];
					for (byte b1 = 0; bytes.length -1 >= b1; b1++) {
						if (bytes[b1] < bytes[b]) {
							bytes_in[b1] = bytes[b1];
						}
						if (bytes[b1] > bytes[b]) {
							bytes_in[b1 - 1] = bytes[b1];
						}
					}
					searcher(bytes_in, value, p, c, G);
				}
				value++;
				if (G <= 0) {
					minValue = Integer.min(minValue, value);
				}
			}
		}
	}
	
}