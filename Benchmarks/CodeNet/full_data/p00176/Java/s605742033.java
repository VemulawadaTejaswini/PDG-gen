
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class color {
		int r, g, b;
		String s;

		color(int value, String s) {
			r = value >> 16;
			g = (value >> 8) & 255;
			b = value & 255;
			this.s = s;
		}

		int diff(color c) {
			return ((c.r - r) * (c.r - r) + (c.b - b) * (c.b - b) + (c.g - g)
					* (c.g - g));
		}
	}

	void run() {
		color db[] = { new color(0, "black"), new color(0, "blue"),
				new color(0, "lime"), new color(0, "aqua"),
				new color(0, "red"), new color(0, "funchsia"),
				new color(0, "yellow"), new color(0, "white"), };
		db[1].b = 0xff;
		db[2].g = 0xff;
		db[3].g = 0xff;
		db[3].b = 0xff;
		db[4].r = 0xff;
		db[5].b = 0xff;
		db[5].r = 0xff;
		db[6].g = 0xff;
		db[6].r = 0xff;
		db[7].r = 0xff;
		db[7].b = 0xff;
		db[7].g = 0xff;

		for (;;) {
			String buffer = sc.next();
			if (buffer.equals("0")) {
				break;
			}
			Scanner in = new Scanner(buffer.substring(1));
			int value = in.nextInt(16);

			color ti = new color(value, "");
			int max = Integer.MAX_VALUE >> 1;
			String ret = "";
			for (color t : db) {
				if (max > t.diff(ti)) {
					max = t.diff(ti);
					ret = t.s;
				}
			}
			System.out.println(ret);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}