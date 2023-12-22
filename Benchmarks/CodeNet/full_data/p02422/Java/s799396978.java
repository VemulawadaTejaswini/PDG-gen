public class Main {
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		final char[] str = sc.next().toCharArray();
		final int q = sc.nextInt();
		
		for (int i = 0; i < q; ++i) {
			final String cmd = sc.next();
			
			if (cmd.equals("print")) {
				final int a = sc.nextInt();
				final int b = sc.nextInt();
				for (int j = a; j <= b; ++j) {
					out.print(str[j]);
				}
				out.println();
			} else if (cmd.equals("reverse")) {
				final int a = sc.nextInt();
				final int b = sc.nextInt();
				for (int j = a, k = b; j < k; ++j, --k) {
					final char t = str[j];
					str[j] = str[k];
					str[k] = t;
				}
			} else if (cmd.equals("replace")) {
				final int a = sc.nextInt();
				final int b = sc.nextInt();
				final char[] p = sc.next().toCharArray();
				for (int j = a; j <= b; ++j) {
					str[j] = p[j - a];
				}
			}
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}