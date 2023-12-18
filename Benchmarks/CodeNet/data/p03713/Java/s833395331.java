import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int min = Integer.MAX_VALUE;
		min = Math.min(min, getMax(h / 3, w, (h - h / 3) / 2 , w, h - h / 3 - (h - h / 3) / 2, w));
		min = Math.min(min, getMax(h / 3 + 1, w, (h - h / 3 - 1) / 2 , w, h - h / 3 - 1 - (h - h / 3 - 1) / 2, w));
		min = Math.min(min, getMax(h / 3, w, h - h / 3 , w / 2, h - h / 3, w - w / 2));
		min = Math.min(min, getMax(h / 3 + 1, w, h - h / 3 - 1, w / 2, h - h / 3 - 1, w - w / 2));
		min = Math.min(min, getMax(h, w / 3, h, (w - w / 3) / 2, h, w - w / 3 - (w - w / 3) / 2));
		min = Math.min(min, getMax(h, w / 3 + 1, h, (w - w / 3 - 1) / 2, h, w - w / 3 - 1 - (w - w / 3 - 1) / 2));
		min = Math.min(min, getMax(h, w / 3, h / 2, w - w / 3, h - h / 2, w - w / 3));
		min = Math.min(min, getMax(h, w / 3 + 1, h / 2, w - w / 3 - 1, h - h / 2, w - w / 3 - 1));
		System.out.println(min);
	}
	
	static int getMax(int ax, int ay, int bx, int by, int cx, int cy) {
		return Math.max(Math.max(ax * ay, bx * by), cx * cy) - Math.min(Math.min(ax * ay, bx * by), cx * cy);
	}
}
