import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static class Point{
		int old, x, y;

		public Point(int old, int x, int y) {
			super();
			this.old = old;
			this.x = x;
			this.y = y;
		}
	}
	
	public static int[][] move_dir = new int[][]{{1, 0}, {1, 1}, {0, 1}, {-1, 0}, {-1, -1}, {0, -1}};
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		
		final int MAX = 60;
		
		while(true){
			final int t = sc.nextInt();
			final int n = sc.nextInt();
			
			if(t == 0 && n == 0){
				break;
			}
			
			boolean[][] visited = new boolean[MAX + 1 + MAX][MAX + 1 + MAX];
			boolean[][] wall = new boolean[MAX + 1 + MAX][MAX + 1 + MAX];
			
			for(int i = 0; i < n; i++){
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				
				wall[y + MAX][x + MAX] = true;
			}
			
			final int s_x = sc.nextInt();
			final int s_y = sc.nextInt();
			
			Point p = new Point(0 ,s_x + MAX, s_y + MAX);
			LinkedList<Point> queue = new LinkedList<Point>();
			queue.add(p);
			
			int count = 0;
			while(!queue.isEmpty()){
				Point point = queue.poll();
				
				if(point.old > t){
					continue;
				}else if(visited[point.y][point.x]){
					continue;
				}
				
				visited[point.y][point.x] = true;
				count++;
				
				for(int[] move : move_dir){
					final int nx = point.x + move[0];
					final int ny = point.y + move[1];
					
					if(nx < 0 || nx >= (MAX + 1 + MAX) || ny < 0 || ny >= (MAX + 1 + MAX)){
						continue;
					}else if(wall[ny][nx]){
						continue;
					}else if(visited[ny][nx]){
						continue;
					}else{
						queue.add(new Point(point.old + 1, nx, ny));
					}
				}
			}
			
			System.out.println(count);
		}
		
		
	}

}