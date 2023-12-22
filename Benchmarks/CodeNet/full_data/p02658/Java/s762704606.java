import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrayNum = scan.nextInt();
		long[] array = new long[arrayNum];

		for (int i = 0; i < array.length; i++) {
			;
			array[i] = scan.nextInt();
		}
		scan.close();

		long num = 1;
		for (long i : array) {
			num *= i;
		}
		if (num < 1000000000000000000L) {
			System.out.println(num);
		} else if (num >= 1000000000000000000L) {
			System.out.println(-1);
		}
	}

}