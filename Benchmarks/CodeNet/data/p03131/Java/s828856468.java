import java.util.*;

public class Main {
	long K, A, B;

	long calc() {
		long result = 0;
		if ((double) (B - A) / 2 > 1.0) {
			long times = K - (A - 1);
			if (times <= 0) {
				result = 1 + K;
			} else {
				result = A + (times / 2 * (B - A)) + (times % 2) * 1;
			}
		} else {
			result = K + 1;
		}
		return result;
	}

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		K = Long.parseLong(tokens[0]);
		A = Long.parseLong(tokens[1]);
		B = Long.parseLong(tokens[2]);
		in.close();
	}

	public static void main(String[] args) {
		Main ins = new Main();
		System.out.println(ins.calc());
	}

}