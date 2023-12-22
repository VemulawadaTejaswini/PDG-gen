import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static final int ALLOW_NORTH = 1;
	public static final int ALLOW_WEST = 2;
	public static final int ALLOW_SOUTH = 4;
	public static final int ALLOW_EAST = 8;
	
	public static class Walk{
		int x, y, cost;

		public Walk(int x, int y, int cost) {
			super();
			this.x = x;
			this.y = y;
			this.cost = cost;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			boolean[][] is_visited = new boolean[h][w];
			int[][] allow_move = new int[h][w];
			
			for(int i = 0; i < 2*h - 1; i++){
				if(i % 2 == 0){
					final int y = i / 2;
					
					for(int x = 0; x < w - 1; x++){
						final int b = sc.nextInt();
						if(b == 0){
							allow_move[y][x]   |= ALLOW_EAST;
							allow_move[y][x+1] |= ALLOW_WEST;
						}
					}
					
				}else{
					final int y = i / 2;
					
					for(int x = 0; x < w; x++){
						final int b = sc.nextInt();
						if(b == 0){
							allow_move[ y ][x] |= ALLOW_SOUTH;
							allow_move[y+1][x] |= ALLOW_NORTH;
						}
					}
					
				}
			}
			
			LinkedList<Walk> queue = new LinkedList<Walk>();
			queue.add(new Walk(0,0,1));
			
			boolean found = false;
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				//System.out.println(walk.x + " " + walk.y + " " + walk.cost + " " + allow_move[walk.y][walk.x]);
				
				if(walk.x == w - 1 && walk.y == h - 1){
					found = true;
					System.out.println(walk.cost);
					break;
				}
				
				if(is_visited[walk.y][walk.x]){
					continue;
				}
				is_visited[walk.y][walk.x] = true;
				
				if(walk.y > 0 && !is_visited[walk.y - 1][walk.x] && ((allow_move[walk.y][walk.x] & ALLOW_NORTH) > 0)){
					queue.add(new Walk(walk.x, walk.y - 1, walk.cost + 1));
				}
				if(walk.y < h - 1 && !is_visited[walk.y + 1][walk.x] && ((allow_move[walk.y][walk.x] & ALLOW_SOUTH) > 0)){
					queue.add(new Walk(walk.x, walk.y + 1, walk.cost + 1));
				}
				if(walk.x > 0 && !is_visited[walk.y][walk.x - 1] && ((allow_move[walk.y][walk.x] & ALLOW_WEST) > 0)){
					queue.add(new Walk(walk.x - 1, walk.y, walk.cost + 1));
				}
				if(walk.x < w - 1 && !is_visited[walk.y][walk.x + 1] && ((allow_move[walk.y][walk.x] & ALLOW_EAST) > 0)){
					queue.add(new Walk(walk.x + 1, walk.y, walk.cost + 1));
				}
			}
			
			if(!found){
				System.out.println(0);
			}
		}
		
	}

}