import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			int mss = 0, s = 0;
			for (int i = 0; i < n; i++) {
				s += sc.nextInt();
				if (s < 0) s = 0;
				if (mss < s) mss = s;
			}
			System.out.println(mss);
		}

	}

}