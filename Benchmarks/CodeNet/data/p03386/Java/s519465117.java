import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int K = scan.nextInt();
		Set<Integer> nums = new HashSet<>();

		for (int i = 0; i < K; i++) {
			if (A + i > B) break;
			nums.add(A + i);
		}
		for (int i = K - 1; i >= 0; i--) {
			if (B - i < A) break;
			nums.add(B - i);
		}

		nums.forEach(System.out::println);
 	}
}