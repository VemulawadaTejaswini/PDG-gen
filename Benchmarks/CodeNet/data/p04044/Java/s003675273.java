import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt();

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}

		Collections.sort(list);

		final StringBuilder sb = new java.lang.StringBuilder();
		for (final String item : list) {
			sb.append(item);
		}

		// 結果
		System.out.println(sb);
	}

}
