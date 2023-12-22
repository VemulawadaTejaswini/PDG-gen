import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		// 文字列の長さを求める
		long[] max = new long[12];
		int l = 1;
		max[l] = 26;
		while(N > max[l]) {
			l++;
			max[l] = (max[l - 1] + 1) * 26;
		}


		// l桁の範囲で、元の数字をa~zを0~25の26進数として変換する
		N = N - max[l - 1] - 1;
		char[] c = new char[l];
		for (int i = 0; i < l; i++) {
			c[i] = (char)('a' + (N % 26));
			N /= 26;
		}
		for (int i = l - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
}
