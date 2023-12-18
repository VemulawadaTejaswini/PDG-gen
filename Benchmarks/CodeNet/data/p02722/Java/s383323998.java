import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		long N = scan.nextLong();

		long count = 1L;

		List<Long> debug = new ArrayList<>();

		for (long K = 3L; K <= Math.sqrt(N); K++) {

			long reN= N;

			while (reN >= K) {
				if (reN % K == 0L) {
					reN = reN / K;
				} else {
					reN = reN % K;
				}
			}
			if (reN == 1L) {
				count += 2L;
				debug.add(K);
			}
		}

		if (N== 3) {
			count += 1L;
		} else if (N > 3) {
			count += 2L;
		}

		System.out.println(count);
	}
}