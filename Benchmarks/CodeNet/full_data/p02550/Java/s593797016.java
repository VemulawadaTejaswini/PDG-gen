import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		long N = scan.nextLong();
		long X = scan.nextLong();
		long M = scan.nextLong();

		long tmp = X;
		long ans = 0L;
		long sum = X;

		List<Long> list = new ArrayList<>();

		list.add(X);

		long i;
		for (i = 1L; i < N; i++) {
			tmp = ((tmp % M) * (tmp % M)) % M;
			if (list.contains(tmp)) {
				break;
			} else {
				list.add(tmp);
				sum += tmp;
			}
		}

		if (tmp != 0L) {
			ans += sum * (N / i);
			for (long j = 0L; j < N % i; j++) {
				ans += list.get((int) j);
			}
		} else {
			for (long ele : list) {
				ans += ele;
			}
		}

		//結果出力
		System.out.println(ans);
	}
}