import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long result = calcFn(n);

		String resultStr = String.valueOf(result);
		int count = 0;
		int len = resultStr.length();

		for (int i = 0; i < len; i++) {
			String lastStr = resultStr.substring(resultStr.length() - (1 + i));
			boolean hasZero = (lastStr.equals("0"));
			if (hasZero) {
				count++;
			} else {
				System.out.println(count);
				System.exit(0);
			}
		}
		sc.close();
	}

	static long calcFn(long n) {
		if (n < 2) {
			return 1;
		} else {
			return n * calcFn(n - 2);
		}
	}

}
