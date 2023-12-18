import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> mark = new ArrayList<>();
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			sum += a;
			mark.add(sum);
		}
		int be;
		int ans = sum;
		for (int p : mark) {

			be = sum - p;
			if (Math.abs(be - p) < ans) {
				ans = Math.abs(be - p);
			}
		}
		System.out.println(ans);
	}

}
