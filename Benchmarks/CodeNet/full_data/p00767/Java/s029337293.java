import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int h = in.nextInt();
			int w = in.nextInt();
			if ((h | w) == 0)
				break;

			int th = h;
			int tw = w;
			double tmp;
			double diagonal = h * h + w * w;
			double min = 20000;

			// i:height, j:width
			for (int i = 1; i <= 150; i++) {
				for (int j = i + 1; j <= 150; j++) {
					if (i == th && j == tw)
						continue;
					tmp = i * i + j * j;
					if (tmp >= diagonal && tmp <= min) {

						if (tmp == min) {
							if (i < h) {
								h = i;
								w = j;
								min = h * h + w * w;
								continue;
							}
						} else if (tmp == diagonal) {
							if (i > h) {
								h = i;
								w = j;
								min = h * h + w * w;
								continue;
							}
						} else {
							h = i;
							w = j;
							min = h * h + w * w;
						}	
					}
				}
			}
			System.out.println(h + " " + w);
		}
	}

	static public void debug(Object... o) {
		System.err.println(Arrays.deepToString(o));
	}
}