import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		long[] len = new long[3];
		for (int i = 0; i < 3; i++) {
			len[i] = sc.nextLong();
		}

		long tmp = len[0] * len[1] * len[2];
		long ans = 1L << 60;
		for (int i = 0; i < 3; i++) {
			ans = Math.min(ans, tmp / len[i] * Math.abs(len[i] / 2 - (len[i] - len[i] / 2)));
		}
		System.out.println(ans);
	}
}
