import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		boolean flag = false;
		String ans = "";

		for (int i = 1; i <= n; i++) {

			String tmp = sc.next();

			if (mp.containsValue(tmp)) {
				flag = true;
				break;
			}

			mp.putIfAbsent(i, tmp);

		}

		if (flag) {
			ans = "NO";
		} else {
			ans = "YES";
		}

		System.out.println(ans);

	}

}
