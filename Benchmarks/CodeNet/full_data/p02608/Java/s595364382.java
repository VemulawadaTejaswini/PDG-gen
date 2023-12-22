import java.util.*;

public class Main {
	private static int go(int n) {
      	if (n < 6) return 0;
		int m = (int) Math.floor(Math.sqrt(n - 5));
		int c = 0;
		for (int x = 1; x < m; ++x) {
			for (int y = 1; y < (int) Math.floor(Math.sqrt(n - x * x - x - 3)); ++y) {
				for (int z = 1; z < (int) Math.floor(Math.sqrt(n - x * x - y * y - x * y - y - x)); ++z) {
					if (x * x + y * y + z * z + x * y + y * z + z * x == n) c++;
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i = 0; i < N; ++i) {
			System.out.println(go(i + 1));
		}
		
	}
}
