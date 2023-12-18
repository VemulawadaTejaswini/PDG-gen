import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc151_d();
	}
  
  	public static void solve_abc151_d(){

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		char S[][] = new char[H][W];

		for(int i=0;i<H;i++){
			String s = sc.next();
			
			for(int j=0;j<W;j++){
				S[i][j] = s.charAt(j);
			}
		}

		int distMax = 0;
		final int vx[] = {-1,	1,	0,	0	};
		final int vy[] = { 0,	0,	1,	-1	};
		

		//for x
		for(int x=0;x<H;x++){
			for(int y=0;y<W;y++){

				//if char[x][y] == '.'
				if(S[x][y] == '.'){

					//dist[x][y] = bfs
					int distance = solve_abc151_bfs(H, W, S, x, y, vx, vy);

					//if distMax < dist[x][y] then distMax = dist[x][y]
					if(distMax < distance) distMax = distance;
				}
			}
		}
		
		//System.out.println("--------------------------");

		//print distMax
		System.out.println(distMax);

		sc.close();
	}

	public static int solve_abc151_bfs(int H, int W, char[][] maze, int idxStartX, int idxStartY, int[] vx, int[] vy){

		//initialization
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		int distance[][] = new int[H][W];
		int distMax = 0;
		
		for(int x=0;x<H;x++){
			for(int y=0;y<W;y++){
				distance[x][y]	= Integer.MIN_VALUE;
			}
		}
		
		distance[idxStartX][idxStartY] = 0;

		qx.add(idxStartX);
		qy.add(idxStartY);

		//System.out.println("--------------------------");

		//while queue is not empty
		while(!qx.isEmpty()){

			//poll queue
			int x = qx.poll();
			int y = qy.poll();


			//for vx
			for(int i=0;i<vx.length;i++){
				int nextX = x + vx[i];
				int nextY = y + vy[i];

				//if child in maze & child == '.' & distChild != 0
				if(	nextX >= 0	&&	nextX < H 	&&
					nextY >= 0	&&	nextY < W 	&&
					maze[nextX][nextY] == '.'	&&
					distance[nextX][nextY] == Integer.MIN_VALUE){

					//distChild(dist[i+vx][j+vy]) = distParent + 1
					distance[nextX][nextY] = distance[x][y] + 1;

					//add child to queue
					qx.add(nextX);
					qy.add(nextY);

					//if distMax < distChild then distMax = distChild
					if(distMax < distance[nextX][nextY]) distMax = distance[nextX][nextY];
				}
			}
			//System.out.println("x:" + x + "\ty:" + y);

			//end while
		}
		

		//return distMax
		return distMax;
	}
}