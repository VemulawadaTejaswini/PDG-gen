import java.awt.geom.Point2D;
import java.util.*;

public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0) break;
			
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++) map[i] = sc.next().toCharArray();
			
			ArrayDeque<Point2D.Double> que = new ArrayDeque<Point2D.Double>();
			int count = 0;
			char c = '.';
			int x, y;
			Point2D.Double p = new Point2D.Double();
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]!='.'){
						count++;
						c = map[i][j];
						que.offer(new Point2D.Double(j,i));
						while(que.size()!=0){
							p = que.poll();
							y = (int)p.y;
							x = (int)p.x;
							map[y][x] = '.';
							
							if(x!=0 && map[y][x-1]==c) que.offer(new Point2D.Double(x-1,y));
							if(x!=w-1 && map[y][x+1]==c) que.offer(new Point2D.Double(x+1,y));
							if(y!=0 && map[y-1][x]==c) que.offer(new Point2D.Double(x,y-1));
							if(y!=h-1 && map[y+1][x]==c) que.offer(new Point2D.Double(x,y+1));
						}
					}
				}
			}
			System.out.println(count);
		}
	}	
}