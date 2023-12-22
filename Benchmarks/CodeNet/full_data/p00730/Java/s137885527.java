import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			int W = in.nextInt();
			int H = in.nextInt();
			if (n == 0 && W==0 && H==0){
				break;
			}
			ArrayList<Point> piece = new ArrayList<>();
			piece.add(new Point(W, H));
			for (int i = 0; i < n; i++) {
				int p = in.nextInt();
				int s = in.nextInt();
				Point trg = piece.remove(p - 1);
				s %= (trg.w + trg.h) * 2;
				Point new1, new2;
				if (s < trg.w) {
					new1 = new Point(Math.min(s, trg.w - s), trg.h);
					new2 = new Point(Math.max(s, trg.w - s), trg.h);
				} else if (s < trg.w + trg.h) {
					new1 = new Point(trg.w, Math.min(s - trg.w, trg.w + trg.h - s));
					new2 = new Point(trg.w, Math.max(s - trg.w, trg.w + trg.h - s));
				} else if (s < trg.w * 2 + trg.h) {
					new1 = new Point(Math.min(s - trg.w - trg.h, trg.w * 2 + trg.h - s), trg.h);
					new2 = new Point(Math.max(s - trg.w - trg.h, trg.w * 2 + trg.h - s), trg.h);
				} else {
					new1 = new Point(trg.w, Math.min(s - trg.w*2 - trg.h, trg.w * 2 + trg.h * 2 - s));
					new2 = new Point(trg.w, Math.max(s - trg.w*2 - trg.h, trg.w * 2 + trg.h * 2 - s));
				}
				piece.add(new1);
				piece.add(new2);
			}
			PriorityQueue<Integer> que = new PriorityQueue<Integer>();
			for (int i = 0; i < piece.size(); i++) {
				que.add(piece.get(i).w * piece.get(i).h);
			}
			while (!que.isEmpty()) {
				System.out.print(que.poll()+((que.isEmpty())?"\n":" "));
			}
		}
	}
}

class Point {
	int w;
	int h;

	public Point(int w, int h) {
		this.w = w;
		this.h = h;
	}
}