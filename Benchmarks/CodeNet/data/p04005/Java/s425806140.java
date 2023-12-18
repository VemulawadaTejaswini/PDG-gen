import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		long[] len = new long[3];
		for (int i = 0; i < 3; i++) {
			len[i] = sc.nextLong();
		}

		long ans = 1L << 60;
		for (int i = 0; i < 3; i++) {
			long tmp = 1;
			for (int j = 0; j < 3; j++) {
				if (i != j)
					tmp *= len[j];
			}
			ans = Math.min(ans, tmp * Math.abs(len[i] / 2 - (len[i] - len[i] / 2)));
		}
		System.out.println(ans);
	}
}
