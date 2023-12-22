import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Walk implements Comparable<Walk>{
		int cost,pose, x, y;
		
		public Walk(int cost, int pose, int x, int y) {
			super();
			this.cost = cost;
			this.pose = pose;
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Walk arg0) {
			return this.cost - arg0.cost;
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(h == 0 && w == 0){
				break;
			}
			
			int[][] map = new int[h][w];
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					map[i][j] = sc.nextInt();
				}
			}
			boolean[][][] is_visited = new boolean[h][w][4];
			
			int[] ops = new int[4];
			for(int i = 0; i < 4; i++){
				ops[i] = sc.nextInt();
			}
			
			int[][] st = {
					{1,0},
					{0,-1},
					{-1,0},
					{0,1}
			};
			
			
			PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
			queue.add(new Walk(0, 0, 0, 0));
			
			
			while(!queue.isEmpty()){
				Walk wa = queue.poll();
				
				//System.out.println(wa.x + " " + wa.y + " " + wa.cost);
				
				if(wa.x >= w || wa.x < 0 || wa.y >= h || wa.y < 0){
					continue;
				}
				
				if(is_visited[wa.y][wa.x][wa.pose]){
					continue;
				}else{
					is_visited[wa.y][wa.x][wa.pose] = true;
				}
				
				if(wa.y == h-1 && wa.x == w-1){
					System.out.println(wa.cost);
					break;
				}
				
				for(int i = 0; i < 4; i++){
					int cost = map[wa.y][wa.x] == i ? 0 : ops[i];
					
					switch(i){
					case 0:
						queue.add(new Walk(wa.cost + cost, wa.pose, wa.x + st[wa.pose][0], wa.y + st[wa.pose][1]));
						break;
					case 1:
						queue.add(new Walk(wa.cost + cost, (wa.pose + 3) % 4, wa.x + st[(wa.pose + 3) % 4][0], wa.y + st[(wa.pose + 3) % 4][1]));
						break;
					case 2:
						queue.add(new Walk(wa.cost + cost, (wa.pose + 2) % 4, wa.x + st[(wa.pose + 2) % 4][0], wa.y + st[(wa.pose + 2) % 4][1]));
						break;
					case 3:
						queue.add(new Walk(wa.cost + cost, (wa.pose + 1) % 4, wa.x + st[(wa.pose + 1) % 4][0], wa.y + st[(wa.pose + 1) % 4][1]));
						break;
					default:	
						break;
					}
				}
			}
		}
	}

}