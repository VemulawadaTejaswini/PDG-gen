import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			if (input > 0) {
				right.add(input);
			} else if (input < 0) {
				left.add(Math.abs(input));
			} else {
				K--;
			}
		}
		System.out.println(solve(K, left, right));
		sc.close();
	}

	private static int solve(int K, ArrayList<Integer> left, ArrayList<Integer> right) {
		if (right.isEmpty() && left.isEmpty()) {
			return 0;
		}
		if (right.isEmpty()) {
			return left.get(left.size() - K);
		}
		if (left.isEmpty()) {
			return right.get(K - 1);
		}
		int min = Integer.MAX_VALUE;
		int steps = K - right.size();
		while (K >= steps) {
			int length = 0;
			int left_index = left.size() - steps;
			int left_pos = left_index >= 0 && left_index < left.size() ? left.get(left_index) : 0;
			int right_index = K - 1 - steps;
			int right_pos = right_index >= 0 && right_index < right.size() ? right.get(right_index) : 0;
			if (left_pos < right_pos) {
				length = left_pos * 2 + right_pos;
			} else {
				length = right_pos * 2 + left_pos;
			}
			steps++;
			if (length < min && length != 0) {
				min = length;
			}
		}
		return min;
	}

}
