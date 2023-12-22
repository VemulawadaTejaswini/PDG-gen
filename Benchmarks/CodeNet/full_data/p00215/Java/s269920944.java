import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Walk{
		int cost;
		int x,y;
		int next;   
		int count;
		
		public Walk(int cost, int x, int y, int next, int count) {
			super();
			this.cost = cost;
			this.x = x;
			this.y = y;
			this.next = next;
			this.count = count;
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
			
			byte[][] map = new byte[h][w];
			int s_x = -1, s_y = -1, g_x = -1, g_y = -1;
			
			for(int i = 0; i < h; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < w; j++){
					if('0' <= input[j] && input[j] <= '9'){
						map[i][j] = (byte) (input[j] - '0');
					}else{
						if('S' == input[j]){
							s_x = j;
							s_y = i;
						}else if('G' == input[j]){
							g_x = j;
							g_y = i;
						}
						
						map[i][j] = 0;
					}
				}
			}
			
			boolean[][][] visited= new boolean[h][w][6];
			int min = Integer.MAX_VALUE;
			int min_pos = -1;
			LinkedList<Walk> queue = new LinkedList<Walk>();
			for(int i = 1; i <= 5; i++){
				queue.clear();
				queue.add(new Walk(0, s_x, s_y, i, 1));
				
				while(!queue.isEmpty()){
					Walk walk = queue.poll();
					
					if(walk.x == g_x && walk.y == g_y && walk.count == 5){
						if(min > walk.cost){
							min = walk.cost;
							min_pos = i;
							//System.out.println(i + " " + walk.cost);
						}
						
						break;
					}
					
					if(visited[walk.y][walk.x][walk.count]){
						continue;
					}else{
						visited[walk.y][walk.x][walk.count] = true;
					}
					
					if(map[walk.y][walk.x] == walk.next && walk.count != 5){
						walk.next = walk.next + 1 > 5 ? 1 : walk.next + 1;
						walk.count++;
					}
					
					if(walk.x != 0 && !visited[walk.y][walk.x-1][walk.count]){
						queue.add(new Walk(walk.cost+1, walk.x - 1, walk.y, walk.next, walk.count));
					}
					
					if(walk.x != w-1 && !visited[walk.y][walk.x+1][walk.count]){
						queue.add(new Walk(walk.cost+1, walk.x + 1, walk.y, walk.next, walk.count));
					}
					
					if(walk.y != 0 && !visited[walk.y-1][walk.x][walk.count]){
						queue.add(new Walk(walk.cost+1, walk.x, walk.y - 1, walk.next, walk.count));
					}
					
					if(walk.y != h-1 && !visited[walk.y+1][walk.x][walk.count]){
						queue.add(new Walk(walk.cost+1, walk.x, walk.y + 1, walk.next, walk.count));
					}
				}
				
				if(i != 5){
					for(int j = 0; j < h; j++){
						for(int k = 0; k < w; k++){
							for(int l = 0; l < 6; l++){
								visited[j][k][l] = false;
							}
						}
					}
				}
			}
			
			if(min == Integer.MAX_VALUE){
				System.out.println("NA");
			}else{
				System.out.println((min_pos - 1 <= 0 ? 5 : min_pos - 1) + " " + min);
			}
		}
		
	}
}