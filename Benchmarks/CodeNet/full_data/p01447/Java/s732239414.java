import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int N = sc.nextInt();
		long c = 1;
		for (int i = 1;; ++i) {
			c *= 3;
			if (N <= c) {
				System.out.println(i);
				break;
			}
		}
	}

}