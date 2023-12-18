import java.util.Scanner;

public class Main {

	int N = 0;

	public static void main(String[] args) {
		Main myself = new Main();
		myself.execute();
	}

	/**
	 * 実処理メソッド
	 */
	public void execute() {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		int fx = getfx(N);

		int mod = fx % N;

		if (mod == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

	private int getfx(int value) {

		String strvalue = Integer.toString(N);
		// 各桁を取得して足し算する

		int sum = 0;
		int length = strvalue.length();

		for (int i = 0; i < length; i++) {
			char pos = strvalue.charAt(i);

			sum += Integer.parseInt(Character.toString(pos));
		}

		return sum;
	}

}
