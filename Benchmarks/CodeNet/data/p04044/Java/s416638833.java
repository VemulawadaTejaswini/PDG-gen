import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			list.add(s);
		}
		Collections.sort(list);
		for (String str : list) {
			System.out.print(str);
		}
		System.out.println("");
 	}
}