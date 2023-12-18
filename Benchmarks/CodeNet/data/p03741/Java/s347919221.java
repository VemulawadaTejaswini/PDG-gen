
public class Main {
	public static void main(String[] args) {
		int N = NI();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = NI();
		}
		long ans = 0;
		if (a[0] == 0) {
			a[0] = 1;
			ans = solve(a);
			a[0] = -1;
			ans = Math.min(ans, solve(a));
			ans++;
		} else {
			ans = solve(a);
		}
		System.out.println(ans);
	}
	private static long solve(int[] a) {
		long ans = 0;
		long sum = a[0];
		for (int i = 1; i < a.length; i++) {
			if (sum > 0) {
				if (sum + a[i] >= 0) {
					ans += sum + a[i] + 1;
					sum = -1;
				} else {
					sum += a[i];
				}
			} else {
				if (sum + a[i] <= 0) {
					ans += -(sum+a[i]) + 1;
					sum = 1;
				} else {
					sum += a[i];
				}
			}
		}
		return ans;
	}
	static int NI(){
		try {
			int c=System.in.read(),r=0;
			for(;c!='-'&&(c<'0'||'9'<c);)c=System.in.read();
			if(c=='-') return -NI();
			for(;'0'<=c&&c<='9';c=System.in.read())
				r = r * 10 + c - '0';
			return r;
		} catch (Exception e) {
			return -1;
		}
	}
	static String next() {
		try {
			StringBuilder res = new StringBuilder("");
			int c = System.in.read();
			while (Character.isWhitespace(c))
				c = System.in.read();
			do {
				res.append((char) c);
			} while (!Character.isWhitespace(c = System.in.read()));
			return res.toString();
		} catch (Exception e) {
			return null;
		}
	}
}
