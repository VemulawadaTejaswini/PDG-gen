import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	
	private static class Walk implements Comparable<Walk>{
		int x,y,t,rule;
		
		Walk(int x, int y, int t,int r){
			this.x = x;
			this.y = y;
			this.t = t;
			this.rule = r;
		}

		@Override
		public int compareTo(Walk arg0) {
			return this.rule < arg0.rule ? -1 : this.rule > arg0.rule ? 1 : 0; 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][][] map = new int[202][202][6]; 
		
		for(int i = 0; i < 202; i++){
			for(int j = 0; j < 202; j++){
				for(int k = 0; k < 6; k++){
					map[i][j][k] = Integer.MAX_VALUE;
				}
			}
		}
		
		final int sx = sc.nextInt() + 100;
		final int sy = sc.nextInt() + 100;
		final int gx = sc.nextInt() + 100;
		final int gy = sc.nextInt() + 100;
		
		final int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			final int x = sc.nextInt() + 100;
			final int y = sc.nextInt() + 100;
			
			
			for(int j = 0; j < 6; j++){
				map[x][y][j] = -1;
			}
		}
		
		final int lx = sc.nextInt();
		final int ly = sc.nextInt();
		
		
		PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
		queue.add(new Walk(sx,sy,0,0));
		
		while(!queue.isEmpty()){
			Walk w = queue.poll();
			
			final int dir = (w.x - 100) % 6 * (w.y - 100) % 6 * w.t % 6;
			
			map[w.x][w.y][w.t%6] = w.rule;
			
			if(w.x == gx && w.y == gy){
				System.out.println(w.rule);
				return;
			}
			
			for(int i = 0; i < 7; i++){
				int dx = 0, dy = 0;
				
				if(w.x % 2 == 0){
					switch(i){
					case 0:
						dx = 0;
						dy = 1;
						break;
					case 1:
						dx = 1;
						dy = 0;
						break;
					case 2:
						dx = 1;
						dy = -1;
						break;
					case 3:
						dx = 0;
						dy = -1;
						break;
					case 4:
						dx = -1;
						dy = -1;
						break;
					case 5:
						dx = -1;
						dy = 0;
						break;
					case 6:
						dx = 0;
						dy = 0;
						break;
					}
				}else{
					switch(i){
					case 0:
						dx = 0;
						dy = 1;
						break;
					case 1:
						dx = 1;
						dy = 1;
						break;
					case 2:
						dx = 1;
						dy = 0;
						break;
					case 3:
						dx = 0;
						dy = -1;
						break;
					case 4:
						dx = 1;
						dy = 0;
						break;
					case 5:
						dx = -1;
						dy = 1;
						break;
					case 6:
						dx = 0;
						dy = 0;
						break;
					}
				}
					
				if(w.x + dx <= 100+lx && w.x +dx >= (100-lx) && w.y + dy <= 100+ly && w.y +dy >= (100-ly)){
					if(map[w.x + dx][w.y + dy][(w.t+1)%6] > w.rule + (dir == i ? 0 : 1)){
						queue.add(new Walk(w.x + dx, w.y + dy, (w.t+1)%6,w.rule + (dir == i ? 0 : 1)));
					}
				}	
			}	
		}
		
		System.out.println(-1);
	}
	
}