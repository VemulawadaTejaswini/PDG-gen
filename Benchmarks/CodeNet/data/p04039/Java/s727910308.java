import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < k; i++) {
			set.add(sc.nextInt());
		}
		while (true) {
			if (check(n, set)) {
				System.out.println(n);
				return;
			}
			n++;
		}
	}
	
	static boolean check(int num, HashSet<Integer> set) {
		while (num > 0) {
			if (set.contains(num % 10)) {
				return false;
			}
			num /= 10;
		}
		return true;
	}
}
