import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			int n = sc.nextInt();
			List<Integer> an = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				an.add(sc.nextInt());
			}

			int[] resultList = new int[an.size()];
			for (int i = 1; i <= an.size(); i++) {
				int cand = an.get(i - 1);
				resultList[cand - 1] = i;
			}

			StringBuilder sb = new StringBuilder();
			for (int result : resultList) {
				sb.append(result);
				sb.append(" ");
			}
			sb.setLength(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
