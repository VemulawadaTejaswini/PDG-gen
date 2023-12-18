import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next()) - 1;
		List<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			for (int j = 0; j < b; j++)
				s.add(a);
		}
		Collections.sort(s);
		System.out.println(s.get(k));
	}
}