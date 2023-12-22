import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int c = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int d = sc.nextInt();
			if(c == 0 && n == 0 && m == 0 && s == 0 && d == 0) break;
			
			int[][] map = new int[n][n];
			for(int i = 0; i < n; i++) {
				Arrays.fill(map[i],2 << 28);
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
					queue.clear();
					break;
				}
				for(int i = 0; i < n; i++) {
					if(map[data.place][i] == 2<<28) continue;
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