import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		int q =sc.nextInt();
		List<Integer> t = new ArrayList<>();
		for (int i = 0; i < q; i++) {
			t.add(sc.nextInt());
		}
		int count = 0;
		for (int i = 0; i < q; i++) {
			int e = t.get(i);
			for (Integer j : s) {
				if (j.intValue() == e) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
