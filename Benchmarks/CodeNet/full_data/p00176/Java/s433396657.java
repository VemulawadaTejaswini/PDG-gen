
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		P[] ps = new P[] {
				new P("black", get("000000")),
				new P("blue", get("0000ff")),
				new P("lime", get("00ff00")),
				new P("aqua", get("00ffff")),
				new P("red", get("ff0000")),
				new P("fuchsia", get("ff00ff")),
				new P("yellow", get("ffff00")),
				new P("white", get("ffffff")),
		};
		for (;sc.hasNext();) {
			String s = sc.next();
			if (s.equals("0")) break;
			s = s.substring(1);
			int[] rgb = get(s);
			int best = Integer.MAX_VALUE;
			P ans = null;
			for (P p : ps) {
				int d = d2(rgb, p.rgb);
				if (best > d) {
					best = d;
					ans = p;
				}
			}
			System.out.println(ans.name);
		}
	}
	
	int sq(int x) { return x * x; }
	int d2(int[] a, int[] b) {
		return sq(a[0] - b[0]) + sq(a[1] - b[1]) + sq(a[2] - b[2]);
	}
	
	int[] get(String s) {
		int x = Integer.parseInt(s, 16);
		int b = x % 256; x /= 256;
		int g = x % 256; x /= 256;
		int r = x % 256; x /= 256;
		return new int[]{r, g, b};
	}

	static class P {
		String name;
		int[] rgb;
		private P(String name, int[] is) {
			this.name = name;
			this.rgb = is; 
		}
	}
}