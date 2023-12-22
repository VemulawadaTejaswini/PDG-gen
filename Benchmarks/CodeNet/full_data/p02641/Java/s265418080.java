import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Integer> pList;

	static final long DIVIDE_NUMBER = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int n = scan.nextInt();

		pList = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {

			pList.add(scan.nextInt());
		}

		int answer = check(x);

		println(answer);
	}

	public static int check(int x) {

		if (!pList.contains(x)) {
			return x;
		}

		int upper = x + 1;
		int lower = x - 1;

		while (true) {

			if (!pList.contains(lower)) {
				return lower;
			}

			if (!pList.contains(upper)) {
				return upper;
			}

			upper++;
			lower--;
		}
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
