import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				int n = sc.nextInt();
				System.out.println(solve(n));
			}
		}
	}

	public static long solve(int n) {
		boolean[] result = new boolean[n];
		Arrays.fill(result, true);
		result[0] = false;
		for (int i = 1; i < (int)(Math.pow(n , 0.5) + 1); i++) {
			if (result[i]) {
				for (int j = (int)Math.pow(i + 1, 2) - 1; j < n; j += (i + 1)) {
					result[j] = false;
				}
			}
		}
		
		int count = 0;
		for (boolean b : result) {
			count += (b) ? 1 : 0;
		}
		return  count;
	}
}