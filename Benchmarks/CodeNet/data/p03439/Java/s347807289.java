
import java.util.Arrays;
import java.util.Scanner;

class Main {

	@SuppressWarnings("unchecked")
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(0);
		String str1 = sc.next();
		if (str1.equals("Vacant")) {
			return;
		}
		System.out.println(N - 1);
		String str2 = sc.next();
		if (str2.equals("Vacant")) {
			return;
		}
		int s = 0;
		int t = N - 1;
		while (true) {
			int m = (s + t) / 2;
			System.out.println(m);
			String str = sc.next();
			if (str.equals("Vacant"))
				return;
			if ((s % 2 == m % 2) == (str1.equals(str))) {
				s = m;
				str1 = str;
			} else {
				t = m;
				str2 = str;
			}
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
