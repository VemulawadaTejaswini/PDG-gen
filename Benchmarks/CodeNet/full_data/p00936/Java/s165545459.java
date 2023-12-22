public class Main {

	public void run(java.util.Scanner sc, java.io.PrintStream out) {
		final int n = sc.nextInt();
		final double[] r = new double[n];
		for (int i = 0; i < n; ++i)
			r[i] = sc.nextInt();
		final double[] c = new double[n];
		c[0] = r[0];
		for (int i = 1; i < n; ++i) {
			c[i] = r[i];
			for (int j = 0; j < i; ++j) {
				c[i] = Math.max(c[i], c[j] + Math.sqrt(Math.pow(r[j] + r[i], 2) - Math.pow(r[j] - r[i], 2)));
			}
		}
		double res = 0;
		for (int i = 0; i < n; ++i)
			res = Math.max(res, c[i] + r[i]);
		System.out.printf("%.8f\n", res);
	}
	
	public static void main(String[] args) {
		(new Main()).run(new java.util.Scanner(System.in), System.out);
	}

}