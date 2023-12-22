import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			Collections.reverse(list.subList(sc.nextInt(), sc.nextInt()));
		}
		StringBuilder sb = new StringBuilder();
		for (int num : list) {
			sb.append(num + " ");
		}
		String str = sb.toString();
		str = str.substring(0, str.length() - 1);
		System.out.println(str);
		sc.close();
	}
}


