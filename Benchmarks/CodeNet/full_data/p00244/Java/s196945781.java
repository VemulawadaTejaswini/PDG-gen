import java.util.*;

import javax.xml.crypto.Data;
class Main {
	
	static ArrayList<Integer> p = new ArrayList<Integer>();
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(n == 0 && m == 0) break;
			
			int[][] c = new int[n][n];
			for(int i = 0; i < n; i++) {
				Arrays.fill(c[i], INF);
			}

			for(int i = 0; i < m; i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int tmp = sc.nextInt();
				c[a][b] = Math.min(c[a][b], tmp);
				c[b][a] = Math.min(c[b][a], tmp);
			}
			
			int[][] min = new int[n][2];
			for(int i = 0; i < n; i++) {
				Arrays.fill(min[i], INF);
			}
			
			PriorityQueue<Data> q = new PriorityQueue<Data>();
			q.add(new Data(0,2,0));
			//min[0][0] = min[0][1] = 0;
			int ans = 0;
			while(!q.isEmpty()) {
				Data tmp = q.poll();
				if(tmp.now == n-1 && tmp.ticket != 1) {
					ans = tmp.cost;
					break;
				}
				if(tmp.ticket == 1) {
					for(int i = 0; i < n; i++) {
						if(c[tmp.now][i] != INF) {
							q.add(new Data(i,0,tmp.cost));
						}
					}
				}
				if(tmp.ticket == 0) {
					if(min[tmp.now][0] <= tmp.cost) continue;
					min[tmp.now][0] = tmp.cost;
					for(int i = 0; i < n; i++) {
						if(c[tmp.now][i] != INF) {
							q.add(new Data(i,0,tmp.cost + c[tmp.now][i]));
						}
					}
				}
				if(tmp.ticket == 2) {
					if(min[tmp.now][1] <= tmp.cost) continue;
					min[tmp.now][1] = tmp.cost;
					for(int i = 0; i < n; i++) {
						if(c[tmp.now][i] != INF) {
							q.add(new Data(i,2,tmp.cost + c[tmp.now][i]));
							q.add(new Data(i,1,tmp.cost));
						}
					}
				}
			}
			
			System.out.println(ans);
			
			
			
		}
	}
	
	static class Data implements Comparable<Data>{
		int now;
		int ticket;
		int cost;
		Data(int a, int b,int c) {
			now = a;
			ticket = b;
			cost = c;
		}
		@Override
		public int compareTo(Data o) {
			return this.cost - o.cost;
		}
	}
	
	
}