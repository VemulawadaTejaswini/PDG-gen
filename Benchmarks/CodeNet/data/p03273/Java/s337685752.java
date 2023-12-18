import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] a = new char[h][];
		
		for (int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}

		Set<Integer> hsw = new HashSet<>();
		out:
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				if (a[j][i] == '#') {
					continue out;
				}
			}
			
			hsw.add(i);
		}
		
		Set<Integer> hsh = new HashSet<>();
		out:
		for (int j = 0; j < h; j++) {
			for (int i = 0; i < w; i++) {
				if (a[j][i] == '#') {
					continue out;
				}
			}
			
			hsh.add(j);
		}

		for (int i = 0; i < h; i++) {
			if (hsh.contains(i)) {
				continue;
			}
			for (int j = 0; j < w; j++) {
				if (hsw.contains(j)) {
					continue;
				}
				
				pr.print(a[i][j]);
			}
			pr.println();
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
