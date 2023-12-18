import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


class Point{
	public int x;
	public int y;
	Point(int a, int b){
		this.x = a;
		this.y = b;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String P = "";

		String[][] S = new String[H][W];

		for(int i = 0 ; i < H ; i++){
			P = sc.next();
			for(int j = 0 ; j < W ; j++){
				S[i][j] = P.substring(j, j+1);
			}
		}
		sc.close();


		int[][] A = new int[H][W];

		Queue<Point> queue = new ArrayDeque<Point>();

		int[] dx = {0,1,0,-1};
		int[] dy = {-1,0,1,0};

		for(int i = 0 ; i < H ; i++){
			for(int j = 0 ; j < W ; j++){
				if(S[i][j].equals("#")){
					queue.add(new Point(i,j));
					A[i][j] = 1;
				}
			}
		}
		int ans = 0 ;
		while(!queue.isEmpty()){
			Point p = queue.poll();
			for(int i = 0 ; i < 4 ; i++){
				int x = p.x + dx[i];
				int y = p.y + dy[i];

				if (x>=0 && x<W && y>=0 && y<H) {
					if(!S[y][x].equals("#") && A[y][x] == 0){
						queue.add(new Point(x,y));
						A[y][x] = A[p.x][p.y] + 1;
						if(ans < A[y][x]){
							ans = A[y][x];
						}
					}
				}
			}
		}
		System.out.println(ans-1);

	}
}
