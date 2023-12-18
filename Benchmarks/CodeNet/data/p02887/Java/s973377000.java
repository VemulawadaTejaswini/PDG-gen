import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < n; i++) {
			if (list.size() == 0) {
				list.add(s[i]);
				continue;
			}
			if (list.get(list.size() - 1).equals(s[i])) {
				continue;
			}
			list.add(s[i]);
		}
		System.out.println(list.size());
	}
}