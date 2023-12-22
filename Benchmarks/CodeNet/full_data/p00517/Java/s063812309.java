import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static final int[][] move_dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {-1, -1}};
	
	public static boolean is_ok(final int x, final int y, final int w, final int h){
		if(x < 0 || y < 0 || x >= w || y >= h){
			return false;
		}else{
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int W = sc.nextInt();
		final int H = sc.nextInt();
		final int N = sc.nextInt();
		
		int[][] routes = new int[N][2];
		for(int i = 0; i < N; i++){
			final int x = sc.nextInt() - 1;
			final int y = sc.nextInt() - 1;
			
			routes[i][0] = x;
			routes[i][1] = y;
		}
		
		boolean[][][] visited = new boolean[N][H][W];
		LinkedList<Integer> route_queue = new LinkedList<Integer>();
		LinkedList<Integer> x_queue = new LinkedList<Integer>();
		LinkedList<Integer> y_queue = new LinkedList<Integer>();
		LinkedList<Integer> time_queue = new LinkedList<Integer>();
		
		route_queue.add(1);
		x_queue.add(routes[0][0]);
		y_queue.add(routes[0][1]);
		time_queue.add(0);
		
		visited[0][routes[0][0]][routes[0][0]] = true;
		
		int cur_route = -1;
		while(!route_queue.isEmpty()){
			final int route = route_queue.poll();
			final int x = x_queue.poll();
			final int y = y_queue.poll();
			final int time = time_queue.poll();
			
			cur_route = Math.max(route, cur_route);
			if(cur_route > route){
				continue;
			}
			
			//System.out.println(x + " " + y + " " + time + " " + route);
			
			final int next_route = route + 1;
			
			if(routes[route][0] == x && routes[route][1] == y){
				if(next_route == N){
					System.out.println(time);
					break;
				}else if(!visited[next_route][y][x]){
					visited[next_route][y][x] = true;
					x_queue.addFirst(x);
					y_queue.addFirst(y);
					route_queue.addFirst(next_route);
					time_queue.addFirst(time);
					
					System.gc();
					
					continue;
				}
			}
			
			for(int[] move : move_dir){
				final int nx = x + move[0];
				final int ny = y + move[1];
				
				if(!is_ok(nx, ny, W, H)){
					continue;
				}else if(visited[route][ny][nx]){
					continue;
				}
				
				visited[route][ny][nx] = true;
				x_queue.add(nx);
				y_queue.add(ny);
				route_queue.add(route);
				time_queue.add(time + 1);
			}
		}
		
		
	}

}