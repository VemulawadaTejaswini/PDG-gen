import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nl = sc.next();
		int n = Integer.parseInt(nl.split(" ")[0]);
		int l = Integer.parseInt(nl.split(" ")[1]);
		List<String> list = new ArrayList<String>();

		while (sc.hasNext()) {
			list.add(sc.next());
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (String str : list) {
			sb.append(str);
		}
		System.out.println(sb.toString());
	}
}