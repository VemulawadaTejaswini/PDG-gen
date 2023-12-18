import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int sum = 0;
		int[] array = new int[length];
		//入力値の取得
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt() - i - 1;
		}
		Arrays.sort(array);

		int a = array[(length + 1) / 2 - 1];
		for (int i = 0; i < length; i++) {
			array[i] -= a;
			sum += Math.abs(array[i]);
		}
		System.out.println(sum);
	}

}