import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int children_number = sc.nextInt();
		int ame_number = sc.nextInt();
		int array[] = new int[children_number];
		int answer = 0;

		//入力値の取得
		for (int i = 0; i < children_number; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		for (int ame : array) {
			ame_number -= ame;
			if (ame_number < 0) {
				break;
			}
			answer++;
		}

		if (ame_number > 0) {
			answer--;
		}

		System.out.println(answer);
	}
}