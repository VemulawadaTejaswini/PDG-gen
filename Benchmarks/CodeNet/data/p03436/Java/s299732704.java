import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        char[][] board = new char[H][W];
        int blackNum = 0;

        for(int i = 0; i < H; i++){
            String row = in.next();
            for(int j = 0; j < W; j++){
                board[i][j] = row.charAt(j);
                if (board[i][j] == '#'){
                    blackNum++;
                }
            }
        }        
        int length = getShortestPathLength(board, H,W);
        int result = -1;
        if(length != -1){
            result = W*H - blackNum - length - 1;
        }        
        System.out.println(blackNum);
        System.out.println(length);
        System.out.println(result);

        in.close();
    }

    static char wall = '#';
    static int[][] dist;
	
	public static int getShortestPathLength(char[][] board, int MaxMapHeight, int MaxMapWidth) {

		dist = new int[MaxMapHeight][MaxMapWidth];
        int[] dx = {1,0,-1,0}, dy = {0,1,0,-1};	
		for (int i = 0; i < MaxMapHeight; i++) {
			for (int j = 0; j < MaxMapWidth; j++) {
				dist[i][j] = -1;
			}
		}
		
		Queue<Point> que = new LinkedList<Point>();
		
		Point Start = new Point(0,0);
		Point Goal = new Point(MaxMapHeight-1,MaxMapWidth-1);	
		int tempX, tempY;
		
		que.offer(new Point(0,0));
		dist[Start.Y][Start.X] = 0;
		
		while(que.size() > 0) {
            Point point = que.poll();
			if(point.Y == MaxMapHeight-1 && point.X == MaxMapWidth-1) break; 
			for(int i = 0; i < 4; i++) {
				tempY = point.Y + dy[i];
				tempX = point.X + dx[i];
				if((0 <= tempY && tempY < MaxMapHeight) && (0 <= tempX && tempX < MaxMapWidth) 
						&& (board[tempY][tempX] != wall) && dist[tempY][tempX] == -1) {
					que.offer(new Point(tempY, tempX));
                    dist[tempY][tempX] = dist[point.Y][point.X] + 1; 
                }
			}
		}
        
        return dist[Goal.Y][Goal.X];        
		
	}    
	static class Point {
		public int Y, X;
		
		public Point(int Y, int X) {
			this.Y = Y;
			this.X = X;
		} 
	} 
}
