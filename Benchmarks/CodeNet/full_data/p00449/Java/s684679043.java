import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n == 0 && k == 0) break;
			
			int[][] edge = new int[n][n];
			for(int i = 0; i < n; i++) {
				Arrays.fill(edge[i], 2 << 28);
			}
			
			for(int i = 0; i < k; i++) {
				if(sc.nextInt() == 0) {
					int a = sc.nextInt();
					int b = sc.nextInt();
					
					int[] map = new int[n];
					Arrays.fill(map, 2 << 27);
					
					PriorityQueue<Data> queue = new PriorityQueue<Data>();
					
					queue.add(new Data(0,a-1));
					int ans = -1;
					while(!queue.isEmpty()) {
						Data tmp = queue.poll();
						if(map[tmp.now] != 2 << 27) continue;
						map[tmp.now] = tmp.time;
						if(tmp.now == b-1) {
							ans = tmp.time;
							break;
						}
						for(int j = 0; j < n; j++) {
							if(edge[tmp.now][j] != 2 << 28) queue.add(new Data(tmp.time + edge[tmp.now][j],j));
						}
					}
					
					System.out.println(ans);
				}
				else {
					int c = sc.nextInt();
					int d = sc.nextInt();
					int e = sc.nextInt();
					
					edge[c-1][d-1] = Math.min(edge[c-1][d-1], e);
					edge[d-1][c-1] = Math.min(edge[d-1][c-1], e);
				}
			}
		}
	}
	
	static class Data implements Comparable<Data>{
		int time;
		int now;
		@Override
		public int compareTo(Data o) {
			
			return this.time - o.time;
		}
		
		Data(int a, int b) {
			time = a;
			now = b;
		}
	}


}