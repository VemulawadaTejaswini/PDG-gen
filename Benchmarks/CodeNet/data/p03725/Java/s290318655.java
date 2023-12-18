import java.util.*;
import java.awt.Point;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		String[] map = new String[H];
		boolean[][] used = new boolean[H][W];
		int dist = Integer.MAX_VALUE;
		ArrayDeque<Point> deq = new ArrayDeque<Point>();
		for(int i=0; i<H; i++){
			map[i] = sc.next();
			for(int j=0; j<W; j++){
				if(map[i].charAt(j)=='S'){
					deq.add(new Point(i,j));
					used[i][j] = true;
					dist = distance(H,W,i,j);
				}
			}
		}
		
		Point[] dir = { new Point(1,0), new Point(-1,0), new Point(0,1), new Point(0,-1) };
		
		for(int i=0; i<K; i++){
			int size = deq.size();
			for(int j=0; j<size; j++){
				Point p = deq.poll();
				for(int k=0; k<4; k++){
					int newX = p.x + dir[k].x;
					int newY = p.y + dir[k].y;
					
					if(in_field(H,W,newX,newY)&&map[newX].charAt(newY)=='.'&&!used[newX][newY]){
						deq.add(new Point(newX,newY));
						used[newX][newY] = true;
						dist = Math.min(dist, distance(H,W,newX,newY));
					}
				}
			}
		}
		
		if(dist==0){
			System.out.println(1);
		}else{
			int ans = (int)Math.ceil((double)dist/(double)K) + 1;
			System.out.println(ans);
		}
		return;
	}
	
	public static boolean in_field(int h, int w, int x, int y){
		return (0 <= x && x < h)&&(0 <= y && y < w);
	}
	
	public static int distance(int h, int w, int x, int y){
		return Math.min(Math.min(x, h-x-1), Math.min(y, w-y-1));
	}
}