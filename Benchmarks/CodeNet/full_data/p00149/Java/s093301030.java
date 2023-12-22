import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int[] l = new int[4];
		int[] r = new int[4];
		while (in.hasNext()) {
			set(in.nextDouble(), l);
			set(in.nextDouble(), r);
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(l[i]);
			System.out.print(' ');
			System.out.println(r[i]);
		}
		in.close();
	}

	static void set(double p, int[] g) {
		if (p >= 1.1) {
			g[0]++;
		} else if (p >= 0.6) {
			g[1]++;
		} else if (p >= 0.2) {
			g[2]++;
		} else {
			g[3]++;
		}
	}
}