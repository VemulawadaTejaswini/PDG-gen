import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		int N = scanner.nextInt();

		List<String> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(scanner.next());
		}

		Collections.sort(list);

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < N; i++) {
			buffer.append(list.get(i));
		}

		System.out.println(buffer);
	}

}