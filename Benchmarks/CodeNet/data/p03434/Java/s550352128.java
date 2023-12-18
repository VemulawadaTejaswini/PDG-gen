import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<Integer> aList = new ArrayList<Integer>();
		for (String s : sc.nextLine().split(" ")) {
			aList.add(Integer.valueOf(s));
		}
		Collections.sort(aList, Collections.reverseOrder());

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				ans += aList.get(i);
			} else {
				ans -= aList.get(i);
			}
		}

		System.out.println(ans);

		sc.close();
	}
}