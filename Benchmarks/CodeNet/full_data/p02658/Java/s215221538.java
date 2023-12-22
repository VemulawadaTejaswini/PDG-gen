import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long maxValue = (long) Math.pow(10, 18);

		int n = sc.nextInt();
		long multi = 1;
		boolean isOk = true;
		boolean isZero = false;
		for (int i = 0; i < n; i++) {
			long m = sc.nextLong();

			if (m == 0) {
				multi = 0;
				isZero = true;
				break;
			} else if (maxValue / m < multi) {
				isOk = false;
			}
			multi *= m;
		}

		if (isOk || isZero) {
			System.out.println(multi);
		} else {
			System.out.println(-1);
		}
	}
}
