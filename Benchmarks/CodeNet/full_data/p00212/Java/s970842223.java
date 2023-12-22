import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	static int c;
	static int n;
	static int m;
	static int s;
	static int d;
	static int[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			c = sc.nextInt();
			n = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
			d = sc.nextInt();
			if(c == 0 && n == 0 && m == 0 && s == 0 && d == 0) break;
			
			map = new int[n][n];
			for(int i = 0; i < n; i++) {
				Arrays.fill(map[i],2 << 27);
			}
			
			for(int i = 0; i < m; i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int f = sc.nextInt();
				map[a][b] = f;
				map[b][a] = f;
			}

			PriorityQueue<Data> queue = new PriorityQueue<Data>();
			queue.add(new Data(s-1,c,0));
			int ans = 0;
			
			while(!queue.isEmpty()) {
				Data data = queue.poll();
				if(data.place == d-1) {
					ans = data.money;
					break;
				}
				for(int i = 0; i < n; i++) {
					if(map[data.place][i] == 2<<27) continue;
					queue.add(new Data(i,data.ticket,data.money + map[data.place][i]));
					if(data.ticket != 0) queue.add(new Data(i,data.ticket-1,data.money + map[data.place][i]/2));
				}
			}
			
			System.out.println(ans);
			
		}
	} 	
	
	static class Data implements Comparable<Data>{
		int place;
		int ticket;
		int money;
		Data(int a, int b, int c) {
			place = a;
			ticket = b;
			money = c;
		}
		@Override
		public int compareTo(Data o) {
			return this.money - o.money;
		}
	}
	
}