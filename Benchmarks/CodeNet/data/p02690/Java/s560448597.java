import java.util.*;

public class Main {

	static int MAX = 100000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		sc.close();

		// 5乗の値を配列に入れておく
		long[] expo = new long[MAX + 1];
		for (int i = 0; i < MAX; i++) {
			expo[i] = (long) Math.pow(i, 5);
		}

		int border = 0;
		for (int i = 0; i < MAX; i++) {
			if (expo[i] > X) {
				border = i;
				break;
			}
		}

		for (int i = border; i >= 1; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (expo[i] + expo[j] == X) {
					System.out.println(i + " " + "-" + j);
					break;
				} else if (expo[i] - expo[j] == X) {
					System.out.println(i + " " + j);
					break;
				}
			}
		}
	}
}
