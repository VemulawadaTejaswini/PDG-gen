import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Main m = new Main();
		while (m.input()) {
			m.print();
		}
		m.release();
 	}
	
	BufferedReader reader = null;
	Main.HW hw = null;
	
	Main() {
		init();
	}
	
	public void init() {
		reader = new BufferedReader(
			new InputStreamReader(System.in)
			);
	}
	
	public void release() {
		if (reader == null) {
			return;
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			reader = null;
		}
	}
	
	private void sharp(Main.HW hw) {
		if (hw.nonZeroW()) {
			System.out.print("#");
			sharp(hw.getDecW());
		}
	}
	
	private void line(Main.HW hw) {
		if (hw.nonZeroH()) {
			sharp(hw);
			System.out.println();
			line(hw.getDecH());
		} else {
			System.out.println();
		}
	}
	
	public void print() {
		if (hw == null) {
			return;
		}
		line(hw);
	}
	
	public boolean input() {
		if (reader == null) {
			init();
		}
		try {
			hw = new Main.HW(reader.readLine().split(" "));
			return !hw.isZero();
		} catch (IOException e) {
			e.printStackTrace();
		}
		hw = null;
		return false;
	}
	
	public static class HW
	{
		private final int h;
		private final int w;
		HW(int h, int w) {
			this.h = h;
			this.w = w;
		}
		HW(String[] data) {
			h = Integer.parseInt(data[0]);
			w = Integer.parseInt(data[1]);
		}
		public int getH() {
			return h;
		}
		public int getW() {
			return w;
		}
		public boolean isZero() {
			return (h == 0) && (w == 0);
		}
		public boolean nonZeroW() {
			return w > 0;
		}
		public boolean nonZeroH() {
			return h > 0;
		}
		public HW getDecW() {
			return new HW(h, w - 1);
		}
		public HW getDecH() {
			return new HW(h - 1, w);
		}
	}
}