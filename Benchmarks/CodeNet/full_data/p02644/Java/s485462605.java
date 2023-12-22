import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int row = inputs.nextInt();
		int col = inputs.nextInt();
		int K = inputs.nextInt();
		int sx = inputs.nextInt()-1;
		int sy = inputs.nextInt()-1;
		int ex = inputs.nextInt()-1;
		int ey = inputs.nextInt()-1;
		char[][] grid = new char[row][col];
		inputs.nextLine();
		for(int i=0;i<row;i++) {
			String lin = inputs.nextLine();
			for(int j=0;j<col;j++) {
				grid[i][j] = lin.charAt(j);
			}
		}
		ArrayDeque<Integer> x = new ArrayDeque<>();
		ArrayDeque<Integer> y = new ArrayDeque<>();
		ArrayDeque<Integer> dir = new ArrayDeque<>();
		ArrayDeque<Integer> moves = new ArrayDeque<>();
		int[][] dist = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i!=sx || j!=sy) {
					dist[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		x.addLast(sx);
		y.addLast(sy);
		dir.addLast(4);
		moves.addLast(0);
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		while(x.size()>0) {
			int exx = x.removeFirst();
			int exy = y.removeFirst();
			int dire = dir.removeFirst();
			int sofar = moves.removeFirst();
			for(int it=0;it<4;it++) {
				boolean huh = false;
				if(dire==4) {
					dire = (it+1)%4;
					huh = true;
				}
				int i = exx+dx[it];
				int j = exy+dy[it];
				if(i<0||i>=row||j<0||j>=col) {
					continue;
				}
				if(it==dire&&dist[i][j]>dist[exx][exy]&&sofar<K) {
					if(grid[i][j] != '@') {
						dist[i][j] = dist[exx][exy];
						x.addLast(i);
						y.addLast(j);
						dir.addLast(it);
						moves.addLast(sofar+1);
					}
				}
				else if(dist[i][j]>dist[exx][exy]+1) {
					if(grid[i][j] != '@') {
						dist[i][j]=dist[exx][exy]+1;
						x.addLast(i);
						y.addLast(j);
						dir.addLast(it);
						moves.addLast(1);
					}
				}
				if(huh) {
					dire=4;
				}
			}
		}
		/*
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(dist[i][j]+" ");
			}
			System.out.println();
		}
		*/
		int min = dist[ex][ey];
	//	System.out.println(ex+" "+ey+" "+dist[ex][ey]);
		if(min==Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else
			System.out.println(min);
	}

}
