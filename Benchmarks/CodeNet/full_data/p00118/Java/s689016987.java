import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static class Point{
		public int x,y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			if(H == 0 && W == 0){
				break;
			}
			
			char[][] input = new char[H][W];
			for(int i = 0; i < H; i++){
				char[] tmp = sc.next().toCharArray();
				for(int j = 0; j < W; j++){
					input[i][j] = tmp[j];
				}
			}
			
			boolean[][] reached = new boolean[H][W];
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					reached[i][j] = false;
				}
			}
			
			int count = 0;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(reached[i][j] == false){
						count++;
						
						Queue<Point> queue = new LinkedList<Point>();
						queue.add(new Point(j,i));
						
						while (!queue.isEmpty()) {
							Point p = queue.poll();
							final int x = p.x;
							final int y = p.y;
							
							reached[y][x] = true;

							if (x != 0 && input[y][x] == input[y][x - 1]
									&& reached[y][x - 1] == false) {
								queue.add(new Point(x-1,y));
							}

							if (y != 0 && input[y][x] == input[y - 1][x]
									&& reached[y - 1][x] == false) {
								queue.add(new Point(x,y-1));
							}

							if (x != W - 1 && input[y][x] == input[y][x + 1]
									&& reached[y][x + 1] == false) {
								queue.add(new Point(x+1,y));
							}

							if (y != H - 1 && input[y][x] == input[y + 1][x]
									&& reached[y + 1][x] == false) {
								queue.add(new Point(x,y+1));
							}
						}
					}
				}
			}
			
			System.out.println(count);
		}
		
		return;
	}
	
}