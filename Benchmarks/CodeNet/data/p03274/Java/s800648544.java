ct Code

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		int N = Integer.valueOf(nextLine.split("\\s+")[0]);
		int K = Integer.valueOf(nextLine.split("\\s+")[1]);
		nextLine = sc.nextLine();
		System.out.println(cal(nextLine.split("\\s+"), K));
	}

	private static int cal(String[] strings, int k) {
		int size = strings.length;
		int min = Integer.valueOf(strings[0]);
		int max = Integer.valueOf(strings[size - 1]);
		if (max <= 0) {
			return -Integer.valueOf(strings[size - k]);
		} else if (min >= 0) {
			return Integer.valueOf(strings[k - 1]);
		}
		int result = Integer.MAX_VALUE;
		for (int i = 0; i + k - 1 < size; i++) {
			int j = i + k - 1;
			min = Integer.valueOf(strings[i]);
			max = Integer.valueOf(strings[j]);
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