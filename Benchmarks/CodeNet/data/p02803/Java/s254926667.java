import java.awt.Point;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static final char WALL = '#';
	static final int ROAD = '.';
	static char[][] board;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		int h = Integer.parseInt(tmpArray[0]);
		int w = Integer.parseInt(tmpArray[1]);
		
		board = new char[h][w];
		
		for(int i = 0; i < h; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < w; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		int result = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				for(int k = 0 ; k < h ; k++) {
					for(int l = 0; l < w; l++) {
						result = Math.max(result, solve(j, i, l, k));					
					}
				}
			}
		}
		
		System.out.println(result);
	}

	static final int dx[] = {0,1,0,-1};
	static final int dy[] = {-1,0,1,0};
	
	static int solve(int startX, int startY, int goalX, int goalY) {
		int result = 0;
		
//		System.out.println("from ("+startX+" "+startY+") to ("+goalX+" "+goalY+")");
		ArrayList<Point> queue = new ArrayList<Point>();
		int h = board.length;
		int w = board[0].length;
		
		int dist[][] = new int[h][w];
		
		dist[startY][startX] = 0;
		
		queue.add(new Point(startX, startY));
		
		int maxLen = 0;
		while(!queue.isEmpty()) {
			Point p = queue.remove(0);
			
			if(p.x == goalX && p.y == goalY) {
				break;
			}
			
			for(int i = 0; i < 4; i++) {
				int tmpX = p.x + dx[i];
				int tmpY = p.y + dy[i];
				
				if(tmpX >= 0 && tmpX < w && tmpY >= 0 && tmpY < h) {
					if(board[tmpY][tmpX] == ROAD && dist[tmpY][tmpX] == 0) {
						dist[tmpY][tmpX] = dist[p.y][p.x] + 1;
						maxLen = Math.max(maxLen, dist[tmpY][tmpX]);
						queue.add(new Point(tmpX, tmpY));
					}
				}
			}
//			printArray(dist);
		}
		return maxLen;
	}
	
	static void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
