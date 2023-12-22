import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Walk implements Comparable<Walk> {
		int x, y, cost;

		public Walk(int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
		}

		@Override
		public int compareTo(Walk arg0) {
			return this.cost - arg0.cost;
		}
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		final int H = sc.nextInt();
		final int W = sc.nextInt();
		
		int map[][] = new int[H][W];
		
		for(int i = 0; i < H; i++){
			char[] ch = sc.next().toCharArray();
			for(int j = 0; j < W; j++){
				map[i][j] = ch[j] - '0';
			}
		}
		
		PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
		queue.add(new Walk(0,0,map[0][0]));
		
		boolean[][] visited = new boolean[H][W];
		
		while(!queue.isEmpty()){
			Walk w = queue.poll();
			
			if(visited[w.y][w.x]){
				continue;
			}
			
			if(w.x == W - 1 && w.y == H - 1){
				System.out.println(w.cost);
				break;
			}
			
			visited[w.y][w.x] = true;
			
			if(w.x != W - 1 && !visited[w.y][w.x + 1]){
				queue.add(new Walk(w.x + 1, w.y, w.cost + map[w.y][w.x + 1]));
			}
			
			if(w.y != H - 1 && !visited[w.y + 1][w.x]){
				queue.add(new Walk(w.x, w.y + 1, w.cost + map[w.y + 1][w.x]));
			}
		}
		
	}

}