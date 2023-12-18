import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int num = 0;
		int sum = 0;

		// 数の入力
		num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j) {
					break;
				}
				sum += list.get(i) * list.get(j);
			}
		}

		System.out.println(sum);

	}
}
