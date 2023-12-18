import java.util.List;
import java.util.Scanner;

public class Main {
	static int v = 0;
	static List<List<Integer>> ansList = null;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(0);
		String first = sc.next();

		int start = 1;
		int end = n - 1;

		while (start <= end) {
			int mid = (end + start + 1) / 2;
			System.out.println(mid);
			String s = sc.next();
			if ("Vacant".equals(s)) {
				sc.close();
				return;
			}

			if (first.equals(s)) {
				if (mid % 2 == 0) {
					start = mid;
				} else {
					if (end == mid) {
						end = mid - 1;
					} else {
						end = mid;
					}
				}
			} else {
				if (mid % 2 == 0) {
					if (end == mid) {
						end = mid - 1;
					} else {
						end = mid;
					}
				} else {
					start = mid;
				}
			}
		}
		sc.close();
	}
}
