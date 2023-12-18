mport java.util.Scanner;

public class Main {

	private static final String YES = "Yes";

	private static final String NO = "No";

	public static void main(String[] args) {

		int[] scanResult = scan();

		if (calc(scanResult)) {
			System.out.println(YES);
		} else {
			System.out.println(NO);
		}
	}

	private static int[] scan() {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		sc.close();
		return arr;
	}

	private static boolean calc(int[] arr) {

		int yen = arr[0];
		int oneNum = arr[1];

		return (yen % 500) <= oneNum;
	}
}