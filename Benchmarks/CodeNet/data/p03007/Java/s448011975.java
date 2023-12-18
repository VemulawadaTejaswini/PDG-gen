import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Long> plus = new ArrayList<>();
		ArrayList<Long> minus = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			long x = sc.nextInt();
			if (x < 0) {
				minus.add(x);
			} else {
				plus.add(x);
			}
		}
		Collections.sort(plus);
		Collections.sort(minus);
		long w;
		if (minus.size() > 0) {
			w = minus.remove(0);
		} else {
			w = plus.remove(0);
		}
		StringBuilder sb = new StringBuilder();
		while (plus.size() > 1) {
			long x = plus.remove(0);
			sb.append(w).append(" ").append(x).append("\n");
			w -= x;
		}
		minus.add(w);
		long ans;
		if (plus.size() > 0) {
			ans = plus.remove(0);
		} else {
			ans = minus.remove(minus.size() - 1);
		}
		for (long x : minus) {
			sb.append(ans).append(" ").append(x).append("\n");
			ans -= x;
		}
		System.out.println(ans);
		System.out.print(sb);
	}
}
