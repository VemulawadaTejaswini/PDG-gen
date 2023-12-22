import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.PriorityQueue;
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
		int[] ans = new int[100];
		
		PriorityQueue<Event> pq = new PriorityQueue<Event>();
		int[] table = new int[17];
		Arrays.fill(table, -1);
		int nextGroup = 0;
		for (int i = 0; i < 100; i++) {
			Event e = new Event();
			e.id = i;
			e.move = Event.ARRIVE;
			e.initTime = i * 5;
			e.time = i * 5;
			e.num = i % 5 == 1 ? 5 : 2;
			e.duration = 17*(i%2) + 3*(i%3)+19;
			pq.add(e);
		}
		while (!pq.isEmpty()) {
			Event e = pq.poll();
			if (e.move == Event.LEAVE) {
				for (int i = 0; i < table.length; i++) {
					if (table[i] == e.id) table[i] = -1;
				}
			} else if (e.move == Event.ARRIVE) {
				int pos = -1;
				if (nextGroup == e.id) {
					for (int i = 0; i + e.num <= table.length; i++) {
						boolean ok = true;
						for (int j = 0; j < e.num; j++) {
							if (table[i+j] != -1) {
								ok = false;
								break;
							}
						}
						if (ok) {
							pos = i;
							break;
						}
					}
				}
				if (pos >= 0) {
					// 座る
					ans[e.id] = e.time - e.initTime;
					for (int j = 0; j < e.num; j++) {
						table[pos + j] = e.id;
					}
					e.time += e.duration;
					e.move = Event.LEAVE;
					pq.add(e);
					nextGroup++;
				} else {
					// 空いてなければ待つ。時刻+1して席が空くのを待つ手抜き実装
					e.time++;
					pq.add(e);
				}
			}
		}
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			System.out.println(ans[n]);
		}
	}
	
	class Event implements Comparable<Event> {
		static final int LEAVE = 0;
		static final int ARRIVE = 1;
		int id;
		int initTime;
		int move;
		int time;
		int num;
		int duration;
		@Override
		public int compareTo(Event o) {
			int c = time - o.time;
			if (c == 0) c = move - o.move;
			if (c == 0) c = id - o.id;
			return c;
		}
	}
}