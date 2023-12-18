import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		List<Integer> diffList = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		// System.out.println(list);

		for (int i = 0; i < m-1; i++) {
			diffList.add(Math.abs(list.get(i)-list.get(i+1)));
		}
		Collections.sort(diffList);
		// System.out.println(diffList);

		int sum = 0;
		for (int i = 0; i < m-1-(n-1); i++) {
			sum += diffList.get(i);
		}
		System.out.println(sum);



	}
}
