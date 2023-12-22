import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextLong();
		long M = sc.nextLong();

		long sum = 0;
		long amari = 0;
		ArrayList<Long> before = new ArrayList<Long>(500);
		for (int i = 0; i < N; i++) {
			if (before.contains(X)) {
				int start = before.indexOf(X);
				List<Long> sub = before.subList(start, i);
				long sum2 = 0;
				for (Long l : sub) {
					sum2 += l;
				}
				sum = sum + ((N - i) / (i - start)) * sum2;
				amari = (N - i) % (i - start);
				X = sub.get(0);
				break;
			}
			sum = sum + X;
			before.add(X);
			X = (X * X) % M;
		}
		for (int i = 0; i < amari; i++) {
			sum = sum + X;
			X = (X * X) % M;
		}
		System.out.print(sum);
	}

}
