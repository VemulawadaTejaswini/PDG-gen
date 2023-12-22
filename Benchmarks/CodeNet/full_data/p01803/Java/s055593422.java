public class Main {

	private static String covconv(String s) {
		final char[] a = s.toCharArray();
		int sp = 0;
		for (int p = 0; p < a.length; ++p) {
			a[sp++] = a[p];
			while (p < a.length && "aiueo".indexOf(a[p]) == -1) ++p;
		}
		return new String(a, 0, sp);
	}
	
	private static int kenkov(String[] s) {
		int rvalue = 0;
		for (int i = 0; i < s.length; ++i)
			rvalue = Math.max(rvalue, s[i].length());
		return rvalue;
	}
	
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			for (;;) {
				final int n = sc.nextInt();
				if (n == 0) break ;
				final String[] s = new String[n];
				for (int i = 0; i < n; ++i) {
					s[i] = covconv(sc.next());
				}
				final int max_length = kenkov(s);
				int k;
				for (k = 1; k < max_length; ++k) {
					try {
						for (int i = 0; i < n; ++i) {
							final String str1 = s[i].substring(0, Math.min(s[i].length(), k));
							for (int j = i + 1; j < n; ++j) {
								final String str2 = s[j].substring(0,  Math.min(s[j].length(), k));
								if (str1.equals(str2))
									throw new LongJmpException();
							}
						}
						System.out.println(k);
						break ;
					} catch (LongJmpException e) { }
				}
				if (k == max_length)
					System.out.println("-1");
			}
		}
	}
	
	private static class LongJmpException extends Exception {
		
	}

}

