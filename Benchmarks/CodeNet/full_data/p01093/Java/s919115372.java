public class Main {

	private java.util.Scanner sc;
	private java.io.PrintStream out;

	public Main(java.io.InputStream in, java.io.PrintStream out) {
		this.sc = new java.util.Scanner(in);
		this.out = out;
	}
	
	public void run() {
		for (;;) {
			final int n = sc.nextInt();
			if (n == 0) break ;
			final int[] d = new int[n];
			for (int i = 0; i < n; ++i)
				d[i] = sc.nextInt();
			
			int rval = Integer.MAX_VALUE;
			for (int i = 0; i < n; ++i)
			for (int j = i + 1; j < n; ++j) {
				rval = Math.min(rval, Math.abs(d[i] - d[j]));
			}
			out.println(rval);
		}
	}
	
	public static void main(String[] args) {
		(new Main(System.in, System.out)).run();
	}

}