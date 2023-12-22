import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static PrintWriter pw = ContestWriter.getInstance("out.txt", true);
	public static void main(String[] args) {
		while(solve());
		pw.flush();
	}

	public static boolean solve() {
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		if (w == 0) return false;
		ArrayList<Cake> cakes = new ArrayList<>();
		cakes.add(new Cake(h,w));
		for(int q=0;q<n;q++) {
			int p = sc.nextInt() - 1;
			int s = sc.nextInt();
			Cake c0 = cakes.get(p);
			s %= (c0.h * 2 + c0.w * 2);
			Cake c1,c2;
			if (s < c0.w) {
				int w1 = s;
				int w2 = c0.w - w1;
				c1 = new Cake(c0.h, w1);
				c2 = new Cake(c0.h, w2);
			} else if(s < c0.w + c0.h) {
				int h1 = s - c0.w;
				int h2 = c0.h - h1;
				c1 = new Cake(h1, c0.w);
				c2 = new Cake(h2, c0.w);
			} else if(s < c0.w * 2 + c0.h) {
				int w1 = s - c0.w - c0.h;
				int w2 = c0.w - w1;
				c1 = new Cake(c0.h, w1);
				c2 = new Cake(c0.h, w2);
			}else {
				int h1 = s - c0.w * 2 - c0.h;
				int h2 = c0.h - h1;
				c1 = new Cake(h1, c0.w);
				c2 = new Cake(h2, c0.w);
			}
			if (c1.w * c1.h > c2.w * c2.h) {
				Cake temp = c1;
				c1 = c2;
				c2 = temp;
			}
			cakes.add(c1);
			cakes.add(c2);
			cakes.remove(p);
//			System.out.println(cakes);
		}
		cakes.sort((c1,c2)->Integer.compare(c1.area(), c2.area()));
		for(int i=0;i<cakes.size();i++) {
			if (i > 0) {
				pw.print(' ');
			}
			pw.print(cakes.get(i).area());
		}
		pw.println();
		return true;
	}
}
class Cake {
	int h,w;
	
	public Cake(int h, int w) {
		this.h = h;
		this.w = w;
	}
	public int area() {return h*w;};
	public String toString() {
		return "(" + h + "," + w + ")";
	}
}
class ContestWriter extends PrintWriter {
	private ContestWriter(String fileName) throws IOException {
		super(new OutputStreamWriter(new FileOutputStream(new File(fileName)), "UTF-8"), false);
	}
	public static PrintWriter getInstance(String fileName, boolean debug) {
		if (debug) return new PrintWriter(System.out);
		try {
			return new ContestWriter(fileName);
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}
	public void println() {
		write('\n');
	}
}
