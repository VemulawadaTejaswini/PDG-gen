import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		boolean oddFlag = false;
		boolean evenFlag = false;
		long leastCommon = 1;
		for (int i = 0; i < n; i++) {
			long num = sc.nextLong();
			if (num % 4 == 0) {
				evenFlag = true;
			} else {
				oddFlag = true;
			}
			leastCommon = calcLeastCommon(leastCommon, num);
			if (leastCommon > m * 2) {
				print(0);
				return;
			}
			if (oddFlag && evenFlag) {
				print(0);
				return;
			}
		}
		print((m + leastCommon / 2) / leastCommon);
		sc.close();
	}

	public static long calcLeastCommon(long x, long y) {
		return x * y / calcGreatestCommon(x, y);
	}

	public static long calcGreatestCommon(long x, long y) {
		long temp;
		while (x % y != 0) {
			temp = y;
			y = x % y;
			x = temp;
		}
		return y;
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
