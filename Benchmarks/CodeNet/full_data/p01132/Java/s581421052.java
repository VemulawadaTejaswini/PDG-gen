public class Main {

	public void run(java.util.Scanner sc, java.io.PrintWriter out) {
		boolean first = true;
		for (;;) {
			final int s = sc.nextInt();
			if (s == 0) break ;
			final int ba = sc.nextInt();
			final int bb = sc.nextInt();
			final int bc = sc.nextInt();
			final int bd = sc.nextInt();
			int r = 10 * ba + 50 * bb + 100 * bc + 500 * bd - s;
			final int ad = r / 500;
			r %= 500;
			final int ac = r / 100;
			r %= 100;
			final int ab = r / 50;
			r %= 50;
			final int aa = r / 10;
			r %= 10;
			
			if (!first)
				out.println();
			first = false;
			
			if (ba - aa > 0)
				out.println("10 " + (ba - aa));
			if (bb - ab > 0)
				out.println("50 " + (bb - ab));
			if (bc - ac > 0)
				out.println("100 " + (bc - ac));
			if (bd - ad > 0)
				out.println("500 " + (bd - ad));
		}
	}
	
	public static void main(String[] args) {
		final java.util.Scanner sc = new java.util.Scanner(System.in);
		final java.io.PrintWriter out = new java.io.PrintWriter(System.out);
		(new Main()).run(sc, out);
		out.flush();
		out.close();
		sc.close();
	}

}