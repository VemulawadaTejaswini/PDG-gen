import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		int H = 0;
		int W = 0;
		int h = 0;
		int w = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ary = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			String word = sc.next();
			ary.add(word);
			word = sc.next();
			ary.add(word);
			// ary.add(String.valueOf(word.charAt(0)));
			// ary.add(String.valueOf(word.charAt(2)));
		}
		H = Integer.parseInt(ary.get(0));
		W = Integer.parseInt(ary.get(1));
		h = Integer.parseInt(ary.get(2));
		w = Integer.parseInt(ary.get(3));
		if (H <= 0 || 20 < H) {
			throw new IllegalArgumentException("out of range");
		}
		if (W <= 0 || 20 < W) {
			throw new IllegalArgumentException("out of range");
		}
		if (h <= 0 || h > H) {
			throw new IllegalArgumentException("out of range");
		}
		if (w <= 0 || w > W) {
			throw new IllegalArgumentException("out of range");
		}

		Cal(H, W, h, w);
	}

	public static void Cal(int H, int W, int h, int w) {
		int cel = H * W;
		int x = h * W;
		int y = w * H;
		int over = h * w;
		System.out.println(cel - x - y + over);
	}
}