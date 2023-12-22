import java.io.File;
import java.io.FileNotFoundException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long startCpuTime = threadMXBean.getCurrentThreadCpuTime();

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0541-input.txt"));

		while (scan.hasNext()) {

			int r = scan.nextInt();
			if (r == 0)
				break;
			Rank[][] rank = new Rank[2][];
			for (int f = 0; f < 2; f++) {
				int w = scan.nextInt();
				int h = scan.nextInt();
				int x = scan.nextInt();
				int y = scan.nextInt();
				Office of = new Office(w, h, r);
				for (int i = 0; i < h; i++)
					for (int j = 0; j < w; j++)
						of.set(j, i, scan.nextInt());
				rank[f] = of.start(x, y);
			}
			// for (int f = 0; f < 2; f++)
			// for (int i = 0; i < rank[f].length; i++)
			// System.out.println(f + " " + rank[f][i].sec + " " +
			// rank[f][i].rooms);
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < rank[0].length; i++)
				for (int j = rank[1].length - 1; j >= 0; j--)
					if (rank[0][i].rooms + rank[1][j].rooms < r)
						break;
					else if (min > rank[0][i].sec + rank[1][j].sec)
						min = rank[0][i].sec + rank[1][j].sec;
			System.out.println(min);
		}

		scan.close();
		long stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println("CPU=" + (stopCpuTime - startCpuTime) / 1000000);

		System.exit(0);
	}
}

class Rank {
	public Rank(int r, int cnt) {
		sec = r;
		rooms = cnt;
	}

	int sec, rooms;
}

class Office {
	class Ent {
		public Ent(int _sec, int _w, int _h) {
			sec = _sec;
			w = _w;
			h = _h;
		}

		int sec, w, h;
	}

	class EntComp implements Comparator<Ent> {

		@Override
		public int compare(Ent o1, Ent o2) {
			if (o1.sec > o2.sec)
				return 1;
			else if (o1.sec == o2.sec)
				return 0;
			else
				return -1;
		}

	}

	int R;
	int[][] roomS;
	boolean[][] roomF;
	PriorityQueue<Ent> ent = new PriorityQueue<Ent>(10, new EntComp());

	public Office(int w, int h, int r) {
		roomS = new int[w][h];
		roomF = new boolean[w][h];
		R = r;
	}

	public Rank[] start(int x, int y) {
		roomF[x - 1][y - 1] = true;
		ent.add(new Ent(roomS[x - 1][y - 1], x - 1, y - 1));
		List<Rank> rank = new ArrayList<Rank>();

		int r = 1, cnt = 0;
		Ent c;
		while (true) {
			c = ent.poll();
			if (c != null && c.sec <= r)
				cnt++;
			else {
				rank.add(new Rank(r, cnt));
				if (cnt >= R)
					break;
				if (c != null) {
					r = c.sec;
					cnt++;
				} else
					break;
			}

			if (c.h > 0 && !roomF[c.w][c.h - 1]) {
				roomF[c.w][c.h - 1] = true;
				ent.add(new Ent(roomS[c.w][c.h - 1], c.w, c.h - 1));
			}
			if (c.w > 0 && !roomF[c.w - 1][c.h]) {
				roomF[c.w - 1][c.h] = true;
				ent.add(new Ent(roomS[c.w - 1][c.h], c.w - 1, c.h));
			}
			if (c.h + 1 < roomF[0].length && !roomF[c.w][c.h + 1]) {
				roomF[c.w][c.h + 1] = true;
				ent.add(new Ent(roomS[c.w][c.h + 1], c.w, c.h + 1));
			}
			if (c.w + 1 < roomF.length && !roomF[c.w + 1][c.h]) {
				roomF[c.w + 1][c.h] = true;
				ent.add(new Ent(roomS[c.w + 1][c.h], c.w + 1, c.h));
			}

		}
		return ((Rank[]) rank.toArray(new Rank[0]));
	}

	public void set(int w, int h, int sec) {
		roomS[w][h] = sec;
	}
}