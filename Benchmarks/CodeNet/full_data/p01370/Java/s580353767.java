import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int t = sc.nextInt();
			int n = sc.nextInt();
			if(t == 0 && n == 0){
				break;
			}
			
			int[][] fault = new int[2][n];
			int[][] map = new int[61][61];
			boolean[][] reach = new boolean[61][61];
			int[][] move = {{1,1},{1,0},{0,-1},{-1,-1},{-1,0},{0,1}};
			
			for(int i = 0; i < 61; i++){
				for(int j = 0; j < 61; j++){
					map[j][i] = Integer.MAX_VALUE;
				}
			}
			
			for(int i = 0; i < n; i++){
				fault[0][i] = sc.nextInt();
				fault[1][i] = sc.nextInt();
				map[fault[0][i] + 30][fault[1][i] + 30] = -1;
			}
			
			int[] start = {sc.nextInt() + 30 , sc.nextInt() + 30};
			reach[start[0]][start[1]] = true;
			int count = 0;
			int x;
			int nextx;
			int y;
			int nexty;
			int size;
			Queue<Point> queue = new LinkedList<Point>();
			queue.offer(new Point(start[0], start[1]));
			while(true){
				if(count == t){
					break;
				}
				size = queue.size();
				for(int i = 0; i < size; i++){
					x = queue.peek().x; 
					y = queue.poll().y;
					for(int j = 0; j < move.length; j++){
						nextx = x + move[j][0];
						nexty = y + move[j][1];
						if(0 <= nextx && 0 <= nexty && nextx <= 60 && nexty <= 60 && map[nextx][nexty] != -1
								&& !reach[nextx][nexty] && map[nextx][nexty] == Integer.MAX_VALUE){
							reach[nextx][nexty]  = true;
							map[nextx][nexty] = count + 1;
							queue.offer(new Point(nextx, nexty));
						}
					}
				}
				count++;
			}
			int sum = 0;
			for(int i = 0; i < 60; i++){
				for(int j = 0; j < 60; j++){
					if(reach[j][i]){
						sum++;
					}
				}
			}
			System.out.println(sum);
			
		}
		
	}

}