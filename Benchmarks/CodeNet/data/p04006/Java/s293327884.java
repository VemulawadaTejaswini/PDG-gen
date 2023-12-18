import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long x = scan.nextLong();

		List<Long> srimeList = new ArrayList<>(N);
		for (long i = 0; i < N; i++) {
			srimeList.add(scan.nextLong());
		}

		List<long[]> costList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			costList.add(new long[N]);
		}
		for (int i = 0; i < N; i++) {
			costList.get(i)[0] = srimeList.get(i);
			for (int castNum = 1; castNum < N; castNum++) {
				costList.get(i)[castNum] = Math.min(costList.get(i)[(castNum - 1 + N) % N],
						srimeList.get((castNum - 1 + N) % N));
			}
		}
		List<Long> result = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			final int j = i;
			result.add(i * x + costList.stream().mapToLong(costArray -> costArray[j]).sum());
		}
		System.out.println(result.stream().mapToLong(i -> i).min().getAsLong());
	}

}
