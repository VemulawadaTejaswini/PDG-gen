import java.util.*;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N];
    int[] Q = new int[N];
    for (int i = 0; i < N; i++) P[i] = sc.nextInt();
    for (int i = 0; i < N; i++) Q[i] = sc.nextInt();
    sc.close();

   		BiPredicate<int[], Integer> exist = (a, n) -> {
			for (int i = 0; i < a.length; i++) if (a[i] == n) return true;
			return false;
		};


		BiFunction<int[], Integer, Boolean> next_perm = (a, r) -> {
			if (a[0] == 0) {
				for (int i = 0; i < a.length; i++) a[i] = i + 1;
				return true;
			}

			int n = a.length;
			for (int i = n - 1; -1 < i; i--) {
				int b = 0;
				for (int j = a[i] + 1; j < r + 1; j++)
					if (!exist.test(a, j)) {
						b = j;
						break;
					}
				a[i] = b;
				if (a[i] != 0) break;
			}
			if (a[0] == 0) return false;
			for (int i = 0; i < n; i++) {
				if (a[i] != 0) continue;
				for (int j = 1; j < n + 1; j++)
					if (!exist.test(a, j)) {
						a[i] = j;
						break;
					}
			}
			return true;
		};

    long c = 0;
    long p = -1;
    long q = -1;
    int[] a = new int[N];
    while ((p == -1 || q == -1) && next_perm.apply(a, N)) {
      c++;
      if (p == -1 && Arrays.equals(a, P)) p = c;
      if (q == -1 && Arrays.equals(a, Q)) q = c;
    }
    long ans = Math.abs(q - p);
    System.out.println(Math.abs(q - p));
  }
}