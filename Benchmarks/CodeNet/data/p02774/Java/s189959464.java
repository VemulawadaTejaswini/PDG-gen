import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Long> nums = new ArrayList<>();
		List<Long> sums = new ArrayList<>();
		int N = scan.nextInt();
		int K = scan.nextInt();

		for (int i = 0; i < N; i++) {
			nums.add(scan.nextLong());
		}

		for (int i = 0; i < N; i++) {
			for (int k = i + 1; k < N; k++) {
				sums.add(nums.get(i) * nums.get(k));
			}
		}

		Collections.sort(sums);

		System.out.println(sums.get(K - 1));
	}
}