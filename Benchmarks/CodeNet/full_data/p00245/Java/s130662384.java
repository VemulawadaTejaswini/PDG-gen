import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static class Walk{
		int x, y, bit, price, time;

		public Walk(int x, int y, int time, int bit, int price) {
			super();
			this.x = x;
			this.y = y;
			this.bit = bit;
			this.price = price;
			this.time = time;
		}
	}
	
	public static int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	public static int[][] next_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {0, 0}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			
			int[][] map = new int[H][W];
			int sx = -1, sy = -1;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					char[] in = sc.next().toCharArray();
					
					if('0' <= in[0] && in[0] <= '9'){
						map[i][j] = (in[0] - '0');
					}else if(in[0] == 'P'){
						map[i][j] = -1;
						sx = j;
						sy = i;
					}else{
						map[i][j] = -1;
					}
				}
			}
			
			final int n = sc.nextInt();
			
			int[] prices = new int[10];
			int[] start = new int[10];
			int[] end = new int[10];
			Set<Integer> set = new HashSet<Integer>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int max_time = 0;
			for(int i = 0; i < n; i++){
				final int g = sc.nextInt();
				
				prices[g] = sc.nextInt();
				start[g] = sc.nextInt();
				end[g] = sc.nextInt();
				set.add(g);
				list.add(g);
				
				max_time = Math.max(max_time, end[g]);
			}
			Collections.sort(list);
			
			int[][][] visited = new int[H][W][max_time + 1];
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					for(int t = 0; t <= max_time; t++){
						visited[i][j][t] = 1 << n;
					}
				}
			}
			
			Queue<Walk> queue = new LinkedList<Walk>();
			queue.add(new Walk(sx, sy, 0, 0, 0));
			
			int max = 0;
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				//System.out.println(walk.x + " " + walk.y + " " + walk.price + " " + walk.time + " " + Integer.toBinaryString(walk.bit));
				
				//in_queue[walk.y][walk.x][walk.bit] = false;
				if(visited[walk.y][walk.x][walk.time] == walk.bit){
					continue;
				}else{
					visited[walk.y][walk.x][walk.time] = walk.bit;
				}
				
				//buy
				for(int[] move : move_dir){
					final int nx = walk.x - move[0];
					final int ny = walk.y - move[1];
						
					if(nx < 0 || nx >= W || ny < 0 || ny >= H){
						continue;
					}else if(map[ny][nx] < 0){
						continue;
					}else if(!set.contains(map[ny][nx])){
						continue;
					}
					
					final int pos = Collections.binarySearch(list, map[ny][nx]);
					
					if(walk.time < start[pos]){
						continue;
					}else if(walk.time >= end[pos]){
						continue;
					}else if((walk.bit & (1 << pos)) != 0){
						continue;
					}
					
					//buy
					walk.bit |= (1 << pos);
					walk.price += prices[pos];
				}
				
				boolean can = false;
					
				for(int i = 0; i < n; i++){
					if((walk.bit & (1 << i)) == 0){
						if(end[i] > walk.time){
							can = true;
							break;
						}
					}
				}
					
				if(!can){
					max = Math.max(max, walk.price);
					continue;
				}
				
				//next
				for(int[] move : next_dir){
					final int nx = walk.x - move[0];
					final int ny = walk.y - move[1];
					
					if(nx < 0 || nx >= W || ny < 0 || ny >= H){
						continue;
					}else if(map[ny][nx] >= 0){
						continue;
					}
					
					int next_price = 0;
					for(int i = 0; i < n; i++){
						if((visited[ny][nx][walk.time + 1] & (1 << i)) != 0){
							next_price += prices[i];
						}
					}
					
					if(next_price <= walk.price){
						queue.add(new Walk(nx, ny, walk.time + 1, walk.bit, walk.price));
					}
				}
			}
			
			System.out.println(max);
		}
	}

}