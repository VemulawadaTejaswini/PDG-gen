import java.util.ArrayList;
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
			int b = sc.nextInt();
			int m = sc.nextInt();
			int e = sc.nextInt();
			List<Integer> list2 = new ArrayList<>();
			for (int j = 0; j < b; j++) {
				list2.add(list.get(j));
			}
			for (int j = m; j < e; j++) {
				list2.add(list.get(j));
			}
			for (int j = b; j < m; j++) {
				list2.add(list.get(j));
			}
			for (int j = e; j < list.size(); j++) {
				list2.add(list.get(j));
			}
			list = list2;
		}
		StringBuilder sb = new StringBuilder();
		for (int num : list) {
			sb.append(num + " ");
		}
		String str = sb.toString();
		str = str.substring(0, str.length() - 1);
		System.out.println(str);
	}
}


