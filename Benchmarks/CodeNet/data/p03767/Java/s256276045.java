import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A012 {

	public static void Main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		ArrayList<Long> list = new ArrayList<>();
		for(int i = 0; i < 3 * N; i++) {
			list.add(scanner.nextLong());
		}

		//どうソートする？
		Collections.sort(list, Collections.reverseOrder());

		long sum = 0;
		for(int i = 0; i < N; i++) {
			sum += list.get(1 + (2 * i));
		}

		System.out.println(sum);
	}

}