import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int H = 0;
		int W = 0;
		int h = 0;
		int w = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ary = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			String word = sc.nextLine();
			ary.add(String.valueOf(word.charAt(0)));
			ary.add(String.valueOf(word.charAt(2)));
		}
		H = Integer.parseInt(ary.get(0));
		W = Integer.parseInt(ary.get(1));
		h = Integer.parseInt(ary.get(2));
		w = Integer.parseInt(ary.get(3));
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