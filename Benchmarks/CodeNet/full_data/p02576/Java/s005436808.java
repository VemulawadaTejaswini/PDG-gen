import java.util.Scanner;

public class Main {

	public static void solve (int n, int x, int t) {

		int joyo = n % x ;
		int ans = n / x ;

		System.out.println((ans * t) + (joyo != 0?t:0));

	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			int n  = scanner.nextInt();
			int x  = scanner.nextInt();
			int t  = scanner.nextInt();
			scanner.nextLine();

			solve(n, x, t);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		// System.out.println((end - start) );
	}


	// ************************************
	// Common
	// ************************************

	private static final int[] changeArrayStringToInt(String line) {

		String[] strArray = line.split(" ");

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
