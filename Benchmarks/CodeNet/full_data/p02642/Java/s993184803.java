import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int n;
	static int[] numberArray;
	static List<Integer> devidelist;

	static final long DIVIDE_NUMBER = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		devidelist = new ArrayList();

		for (int i = 0; i < n; i++) {

			numberArray[i] = scan.nextInt();
		}

		Arrays.sort(numberArray);

		int answer = 0;

		for (int i = 0; i < n; i++) {

			boolean result = check(i);

			if (result) {

				answer++;

			}
		}

		println(answer);
	}

	public static boolean check(int i) {

		int numberI = numberArray[i];

		for (int devideNumber : devidelist) {

			if (numberI % devideNumber == 0) {

				return false;
			}
		}

		if (i != n - 1 && numberI == numberArray[i + 1]) {

			devidelist.add(numberI);
			return false;
		}

		devidelist.add(numberI);
		return true;
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
