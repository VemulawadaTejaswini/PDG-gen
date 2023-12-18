import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> s = new ArrayList<String>();
		int i, n;
		String tmp, tmp2;
		n = sc.nextInt();

		for (i = 0; i < n; ++i) {
			tmp = sc.next();
			if (s.contains(tmp)) {
				System.out.println("No");
				i = n - 1;
				break;
			}
			s.add(tmp);
			if (i > 0) {
				tmp2 = s.get(i - 1);
				if (tmp.charAt(0) != tmp2.charAt(tmp2.length() - 1)) {
					System.out.println("No");
					i = n - 1;
					break;
				}
			}
		}

		if (i == n) {
			System.out.println("Yes");
		}

		sc.close();
	}

}
