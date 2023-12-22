import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			final Map<String, Double> map = new HashMap<String, Double>();
			String[] seed = new String[n];
			for (int i = 0; i < n; i++) {
				String L = sc.next();
				seed[i] = L;
				int P = sc.nextInt();
				int A = sc.nextInt();
				int B = sc.nextInt();
				int C = sc.nextInt();
				int D = sc.nextInt();
				int E = sc.nextInt();
				int F = sc.nextInt();
				int S = sc.nextInt();
				int M = sc.nextInt();
				int t = A + B + C + M * (D + E);
				int inc = (M * F * S - P);
				double ef = 1.0 * inc / t;
				map.put(L, ef);
			}
			Arrays.sort(seed);
			Arrays.sort(seed, new Comparator<String>() {
				public int compare(String a, String b) {
					return map.get(b) - map.get(a) > 0 ? 1 : -1;
				}
			});
			for (int i = 0; i < n; i++) {
				System.out.println(seed[i]);
			}
			System.out.println(("#"));
		}
	}
}