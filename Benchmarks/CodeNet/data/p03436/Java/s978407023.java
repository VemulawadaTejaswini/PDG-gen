import static java.lang.System.*;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] maze = new char[h][w];
		for(int i = 0; i < h; i++) {
			maze[i] = sc.next().toCharArray();
		}
		int whiteMass = -1;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(maze[i][j] == '.')
					whiteMass++;
			}
		}
		Queue<Position> que = new ArrayDeque<>();
		boolean[][] visited = new boolean[h][w];
		int[][] costs = new int[h][w];
		for(int i = 0; i < h; i++)
			Arrays.fill(costs[i], -1);
		que.offer(new Position(0,0));
		costs[0][0] = 0;
		
		while(que.size() > 0) {
			Position pos = que.poll();
			int x = pos.x; int y = pos.y;
			visited[y][x] = true;
			//上
			if(y != 0 && maze[y-1][x] == '.' && !visited[y-1][x]) {
				costs[y-1][x] = costs[y][x] + 1;
				que.offer(new Position(y-1,x));
			}			
			//左
			if(x != 0 && maze[y][x-1] == '.' && !visited[y][x-1]) {
				costs[y][x-1] = costs[y][x] + 1;
				que.offer(new Position(y, x-1));
			}
			//下
			if(y != h-1 && maze[y+1][x] == '.' && !visited[y+1][x]) {
				costs[y+1][x] = costs[y][x] + 1;
				que.offer(new Position(y+1, x));
				
			}
			//右
			if(x != w-1 && maze[y][x+1] == '.' && !visited[y][x+1]) {
				costs[y][x+1] = costs[y][x] + 1;
				que.offer(new Position(y, x+1));
			}		
		}
		
		out.println(whiteMass - costs[h-1][w-1]);
		
		
	}
	static class Position{
		int y;
		int x;
		Position(int y, int x){
			this.y = y;
			this.x = x;			
		}
	}
}

