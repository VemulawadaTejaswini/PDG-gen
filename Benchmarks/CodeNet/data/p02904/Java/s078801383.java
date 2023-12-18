import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = Integer.parseInt(sc.nextLine().replaceAll(" ", ""));
		List<Integer> list = new ArrayList<>();
		List<Integer> sortList = new ArrayList<>(new HashSet<>());

		for (int i = 0; i < n; i++) {
			if(i == n-1) {
				int a = Integer.parseInt(sc.nextLine().replaceAll(" ", ""));

				list.add(a);
				sortList.add(a);
			} else {
				int a = sc.nextInt();

				list.add(a);
				sortList.add(a);
			}
		}

		Collections.sort(sortList);

		int con = n - 1;

		if (con == sortList.get(con) && sortList.size() == n) {

			int b = n + 1 - k;

			List<String> stringList = new ArrayList<>();

			for (int x = 0; x < b; x++) {
				List<Integer> sortList2 = new ArrayList<>();

				for (int y = 0; y < k; y++) {
					int z = x + y;
					sortList2.add(list.get(z));
				}

				Collections.sort(sortList2);

				StringBuilder sb = new StringBuilder();

				for (int o = 0; o < x; o++) {
					sb.append(Integer.toString(list.get(o)));
					sb.append(" ");
				}
				for (int p = 0; p < k; p++) {
					sb.append(Integer.toString(sortList2.get(p)));
					sb.append(" ");
				}
				for (int q = x + k; q < n; q++) {
					sb.append(Integer.toString(list.get(q)));
					if(q != con) {
						sb.append(" ");
					}
				}
				stringList.add(new String(sb).trim());
			}
			List<String> answerList = new ArrayList<>(new HashSet<>(stringList));
			System.out.println(answerList.size());
		}
	}

}