
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(cal(list, K));
	}

	private static int cal(List<Integer> list, int K) {
		int min = list.get(0);
		int max = list.get(list.size() - 1);
		if (max <= 0) {
			return -min;
		} else if (min >= 0) {
			return max;
		}
		int result = Integer.MAX_VALUE;
		for (int i = 0; i + K - 1 < list.size(); i++) {
			int j = i + K - 1;
			min = list.get(i);
			max = list.get(j);
			int temp = countResult(min, max);
			if (result > temp)
				result = temp;
			if (min > 0)
				break;
		}
		return result;
	}

	private static int countResult(int min, int max) {
		if (max <= 0) {
			return -min;
		} else if (min >= 0) {
			return max;
		} else {
			return Math.min(-2 * min + max, -min + 2 * max);
		}
	}
}
