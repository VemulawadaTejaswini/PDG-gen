import java.util.Scanner;

public class Main {
	public static int n;
	public static boolean b[];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		n = s.length();
		b = new boolean[n];
		for (int i = 0; i < n; i++) {
			b[i] = (s.charAt(i) == 'g');
		}

		System.out.println(search(0, 0, 0, 0, 0));
	}

	public static int search(int i, int g, int p, int w, int l) {
		if (i >= n) {
			return w - l;
		}
		int rg = 0;
		int rp = 0;
		rg = search(i + 1, g + 1, p, w, l + (b[i] ? 0 : 1));
		if (p < g) { rp = search(i + 1, g, p + 1, w + (b[i] ? 1 : 0), l); }
		return Math.max(rg, rp);
	}
}
