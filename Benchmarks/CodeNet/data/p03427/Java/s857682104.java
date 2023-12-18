
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		if (N.length() == 1) {
			System.out.println(N);
		}else {
			char[] l = N.toCharArray();
			StringBuilder fix = new StringBuilder();

			if (l[0] == '1') {
				for (int i = 1; i < l.length; i++) {
					fix.append("9");
				}
			}else {
				fix.append((char)(l[0] - 1));
				for (int i = 1; i < l.length; i++) {
					fix.append("9");
				}
			}
			Main main = new Main();
			System.out.println(main.digitSum(Long.valueOf(fix.toString())));
		}

	}

	public long digitSum(long N) {
		long sum = 0;
		while (N > 0) {
			sum += N % 10;
			N = N / 10;
		}
		return sum;
	}
}
