import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String strLine = sc.nextLine();
		String[] strArr = strLine.split(" ");

		String re = "Yes";
		List l = Arrays.asList(strArr);
		Collections.sort(l);

		for (int i = 0; i < l.size() - 1; i++) {
			if (l.get(i).equals(l.get(i + 1))) {
				re = "No";
				break;
			}
		}

		System.out.println(re);

	}

}