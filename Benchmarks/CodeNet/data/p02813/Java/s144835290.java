import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuffer p = new StringBuffer();
		StringBuffer q = new StringBuffer();
		for (int i = 0; i < n; i++) {
			p.append(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			q.append(sc.nextInt());
		}
		sc.close();

		List<String> list = new ArrayList<String>();
		create(n, "", list);
		int pi = list.indexOf(p.toString());
		int qi = list.indexOf(q.toString());
		System.out.println(Math.abs(pi - qi));
	}

	public static void create(int n, String text, List<String> texts) {
		if (text.length() == n) {
			texts.add(text);
		}

		for (int i = 1; i <= n; i++) {
			if (!text.contains(String.valueOf(i))) {
				create(n, text + i, texts);
			}
		}
	}
}
