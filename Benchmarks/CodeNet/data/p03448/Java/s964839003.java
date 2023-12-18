
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// [0]:500円, [1]:100円, [2]:50円, [3]:合計
		int[] coin = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			coin[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(calc(coin));
	}

	public static int calc(int[] a) {
		int[] coin = a;
		int count = 0;
		for (int i = 0; i <= coin[0]; i++) { //500円
			for (int j = 0; j <= coin[1]; j++) { //100円
				for (int k = 0; k <= coin[2]; k++) {//10円
					count += (500 * i + 100 * j + 50 * k) == coin[3] ? 1 : 0;
				}
			}
		}
		return count;
	}

}
