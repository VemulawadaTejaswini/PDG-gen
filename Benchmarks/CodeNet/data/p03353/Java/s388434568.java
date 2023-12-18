import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		String temp = "";
		List<String> list = new ArrayList<>();
		for (int i = 0; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				temp = s.substring(j, i);
				if (!list.contains(temp)) {
					list.add(temp);
				}
			}
		}
		list.sort(null);
		System.out.println(list.get(K - 1));
	}
}