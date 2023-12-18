import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int x = a[i];
				int y = a[j];
				if (x < y) {
					int tmp = x;
					x = y;
					y = tmp;
				}

				int r = x % y;
				while (r != 0) {
					x = y;
					y = r;
					r = x % y;
				}
				//System.out.println(a[i] + " " + a[j] + " " + y);
				list.add(y);
			}
		}

		Collections.sort(list);

		int ans = list.get(0);
		for (Integer integer : list) {
			if (ans != integer) {
				ans = integer;
				break;
			}
		}

		System.out.println(ans);
	}

}
