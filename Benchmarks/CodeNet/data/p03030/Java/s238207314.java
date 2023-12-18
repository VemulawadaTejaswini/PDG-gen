import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<String> slist = new ArrayList<>(0);

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int pi = 100 - sc.nextInt();
			String p = pi + "";
			if (p.length() == 2) {
				p = "0" + p;
			}
			if (p.length() == 1) {
				p = "00" + p;
			}


			slist.add(s + p);

		}

		Object[] result = slist.toArray();
		Arrays.sort(result);

		for (int i = 0; i < n; i++) {
			System.out.println(slist.indexOf(result[i]) + 1);
		}

	}

}
