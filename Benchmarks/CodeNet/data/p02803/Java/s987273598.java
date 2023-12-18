import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static  int H;
	static  int W;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		char[][] S = new char[H][W];
		int[][] dist = new int[H][W];
		for(int i=0;i<H;i++) {
			String tmpS=sc.next();
			for(int j=0;j<W;j++) {
				S[i][j]=tmpS.charAt(j);
				dist[i][j] = -1;
			}
		}
		
		int maxdist=0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(S[i][j]=='.') {
					Coordinate start = new Coordinate(i,j);
					maxdist = Math.max(maxdist, getMaxDist(start,dist,S));
				}
			}
		}
		System.out.println(maxdist);
		
	}
	static int getMaxDist(Coordinate start,int[][] dist1,char[][] S) {
		ArrayDeque<Coordinate> queue = new ArrayDeque<>();
		int[][]dist = new int[H][W];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				dist[i][j]=dist1[i][j];
			}
		}
		
		int[] directionX= {1,0,-1,0};
		int[] directionY= {0,1,0,-1};
		//スタート地点をキューに入れ、対応する距離をゼロとする。
		queue.addLast(start);
		dist[start.x][start.y]=0;

		while(!queue.isEmpty()) {
			//キューから要素を取り出し、対応する距離を
			Coordinate nowCoordinate=queue.removeFirst();
			//隣接行列や隣接リスト等に基づき、近くでまだ訪問していない要素をキューに追加する。その際、対応する距離は現在の要素の距離+1
			for(int i=0;i<4;i++) {
				int newX =directionX[i]+nowCoordinate.x;
				int newY = directionY[i]+nowCoordinate.y;
				int nowdist = dist[nowCoordinate.x][nowCoordinate.y];
				if(0<=(newX) && (newX)<=H-1 && 0<=(newY) && (newY)<=W-1) {
					if(dist[newX][newY]==-1) {
						if(S[newX][newY]=='.') {
							dist[newX][newY]=nowdist+1;
							Coordinate newCoordinate = new Coordinate(newX,newY);
							queue.addLast(newCoordinate);
						}
					}
				}
			}
		}
		int maxdist=0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				maxdist = Math.max(maxdist, dist[i][j]);
			}
		}
		return maxdist;
	}
}

class Direction{
	int x;
	int y;
	public Direction(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class Coordinate{
	int x;
	int y;
	public Coordinate(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Coordinate c) {
		if(c.x==this.x && c.y==this.y) {
			return true;
		}else {
			return false;
		}
	}
}