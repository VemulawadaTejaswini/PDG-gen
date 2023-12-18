import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 117
//D	XXOR
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();

		List<Long> inList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			inList.add(sc.nextLong());
		}
		sc.close();

		long max = K^ inList.get(0);
		long sum = 0l;
		for (long x = 0; x < K; x++) {
			sum = 0l;
			for (Long in : inList) {
				sum += x ^ in;
			}
			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);

	}
}
