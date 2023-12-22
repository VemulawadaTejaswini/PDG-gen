public class Main {

	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);

		for (;;) {
			final int n = sc.nextInt();
			if (n == 0) break ;
			final int[] a = new int[n];
			for (int i = 0; i < n; ++i)
				a[i] = sc.nextInt();
			
			int res = Integer.MAX_VALUE;
			for (int i = 0; i < n; ++i)
			for (int j = i + 1; j < n; ++j) {
				res = Math.min(res, Math.abs(a[i]-a[j]));
			}
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}