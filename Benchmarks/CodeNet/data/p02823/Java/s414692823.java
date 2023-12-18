import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int ans = 1;
		if ((B - A) % 2 != 0) {
			if (A - 1 <= n - B) {
				ans = B - 1;
			} else {
				ans = n - A;
			}
		} else {
			ans = (B - A) / 2;
		}
		System.out.println(ans);
	}
}