import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> b = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			b.add(sc.nextInt());
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = n - 1; i >= 0; i--) {
			if (b.size() > i && b.get(i) == i + 1) {
				b.remove(i);
				ans.add(i + 1);
				i = b.size();
			}
		}
		if (ans.size() != n) {
			System.out.println(-1);
		} else {
			for (int i = n - 1; i >= 0; i--) {
				System.out.println(ans.get(i));
			}
		}
	}
}