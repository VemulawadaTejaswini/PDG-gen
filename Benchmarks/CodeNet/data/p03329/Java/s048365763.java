import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	static int nine[] = { 9, 81, 729, 6561, 59049 };
	static int six[] = { 6, 36, 216, 1296, 7776, 46656 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(N);

		int wk;
		int wk9;
		int wk6;
		for (int i = 0; true; i++) {
			for (int j = 0; j < Math.pow(2, i); j++) {
				wk = arr.get((int) Math.pow(2, i) - 1 + j);

				wk9 = wk - getNine(wk);
				wk6 = wk - getSix(wk);

				if(wk9 == 0 || wk6 == 0) {
					System.out.println(i+1);
					return;
				}
				arr.add(wk9);
				arr.add(wk6);
			}
		}
	}

	public static int getNine(int a) {
		for (int i = 1; i <= nine.length; i++) {
			if (a > nine[nine.length - i]) {
				return nine[nine.length - i];
			}
		}
		return 1;
	}

	public static int getSix(int a) {
		for (int i = 1; i <= six.length; i++) {
			if (a > six[six.length - i]) {
				return six[six.length - i];
			}
		}
		return 1;
	}

}