import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	static class Point{
		int x;
		int y;
		public Point(int xx, int yy){
			x = xx;
			y = yy;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int w = in.nextInt();
			int h = in.nextInt();
			if((w|h)==0) break;
			boolean[][] land = new boolean[h][w];
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(in.nextInt()==1) land[i][j] = true;
					else land[i][j] = false;
				}
			}
			
			LinkedList<Point> queue = new LinkedList<Point>();
			int lands = 0;
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(land[i][j]){
						lands++;
						land[i][j]=false;
						queue.add(new Point(i,j));
						while(!queue.isEmpty()){
							Point base = queue.poll();
							for(int x=-1; x<=1; x++){
								for(int y=-1; y<=1; y++){
									if(0<=base.x+x && base.x+x<h && 0<=base.y+y && base.y+y<w){
										if(land[base.x+x][base.y+y]){
											land[base.x+x][base.y+y] = false;
											queue.add(new Point(base.x+x,base.y+y));
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(lands);
		}
	}
}