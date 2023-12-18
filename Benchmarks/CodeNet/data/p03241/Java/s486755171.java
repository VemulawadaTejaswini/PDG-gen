import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int ans = 1;
		for (int i = 1; i < Math.max(m / 2, 100000); i++) {
			if (m % i == 0 && n <= m / i) {
				ans = i;
			}
		}
		System.out.println(ans);
	}
}