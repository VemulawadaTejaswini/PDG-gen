import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int D = scanner.nextInt();
		int N = scanner.nextInt();
		int x = N + 1;

		//Nが100のときとそれ以外で場合分け
		if (N != 100) {
			System.out.println(N * determine(D));
		} else {
			System.out.println(x * determine(D));
		}
	}

	//Dの値によって場合分け
	public static int determine(int d) {
		int result;
		if (d == 0) {
			result = 1;
		} else if (d == 1) {
			result = 100;
		} else {
			result = 100 * 100;
		}
		return result;
	}
}