import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int t = sc.nextInt();
			int n = sc.nextInt();
			
			if(t == 0 && n == 0){
				break;
			}

			final int offset = 100;
			boolean obst[][] = new boolean[2*offset + 2][2*offset + 2];

			for(int i = 0; i < n; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();

				obst[x + offset][y + offset] = true;
			}

			int startX = sc.nextInt();
			int startY = sc.nextInt();
			
			int dist[][] = new int[2*offset + 2][2*offset  + 2];
//			int result = 1;
			
			ArrayDeque<Point> que = new ArrayDeque<Point>();
			que.add(new Point(startX, startY));
			
			int dx[] = {0,1,1,0,-1,-1};
			int dy[] = {1,1,0,-1,-1,0};
			while(!que.isEmpty()){
				Point p = que.remove();
				
				if(dist[p.x + offset][p.y + offset] > t){
					break;
				}
				
//				dist[p.x + offset][p.y + offset] = true; 
				
//				System.out.println("x "+p.x + " y "+p.y+" "+que.size());
				for(int i = 0; i < 6; i++){
					int tmpX = p.x + dx[i];
					int tmpY = p.y + dy[i];
					
					if(tmpX == startX && tmpY == startY){
						continue;
					}
					
					if(tmpX < -offset || tmpX > offset || tmpY< -offset || tmpY > offset){
						continue;
					}
					
					if(!obst[tmpX + offset][tmpY + offset] && dist[tmpX + offset][tmpY + offset] == 0){
						que.add(new Point(tmpX, tmpY));
						dist[tmpX + offset][tmpY + offset] = dist[p.x + offset][p.y + offset] + 1;
//						result++;
					}
				}
			}
			
			int result = 1;
			for(int i = 0; i < dist.length ; i++){
				for(int j = 0 ; j < dist[0].length; j++){
//					System.out.print(dist[i][j]+" ");
					if(dist[i][j] > 0 && dist[i][j] <= t){
//						System.out.println((i - offset)+","+(j - offset)+" dist "+dist[i][j]);
						result++;
					}
				}
//				System.out.println();
			}
			System.out.println(result);
		}
	}

}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
