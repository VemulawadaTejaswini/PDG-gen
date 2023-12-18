
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int i = 0;
		int ans = 0;
		int k = 0;
		int j = 0;
		int l = 0;

		int ary[] = new int[x];
		for (i = 0; i < x; i++) {
			ary[i] = s.nextInt();
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for (k = 1;;) {
			if (k == 2) {
				break;
			}
			k = ary[k - 1];
			ans++;

			if (list.contains(k)) {

				ans = -1;
				break;
			}
			list.add(k);
		}

		System.out.println(ans);

	}

}