import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		String line2 = sc.nextLine();

		int N = Integer.parseInt(line1);
		int K = Integer.parseInt(line2);

		int s = 1;

		int a = s;
		int b = s;

		for (int i = 0; i < N; i++) {
			a = s;
			b = s;
			if (getA(a) <= getB(b, K)) {
				s = getA(s);
			} else {
				s = getB(s, K);
			}
		}

		System.out.println(s);
	}

	public static int getA(int a) {
		a = a*2;
		return a;
	}

	public static int getB(int b, int k) {
		b = b+k;
		return b;
	}
}