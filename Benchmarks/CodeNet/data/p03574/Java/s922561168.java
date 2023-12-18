

import java.util.Scanner;

public class Main {
	static int n,m;
	static int count;
	static char[][]maze = new char[105][105];
	static boolean[][]vis = new boolean[105][105];
	static int dir[][] = {{0,1},{0,-1},{1,-1},{1,1},{1,0},{-1,0},{-1,-1},{-1,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		for(int i = 0;i<n;i++) {
			maze[i] = sc.next().toCharArray();
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				count = 0;
				if(maze[i][j]=='#') {
					continue;
				}else {
					dfs(i,j);
					maze[i][j] = Integer.toString(count).charAt(0);
				}
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.println(maze[i]);
		}
	}
	public static void dfs(int x,int y) {
		for(int i = 0;i<8;i++) {
			int tx = x + dir[i][0];
			int ty = y + dir[i][1];
			if(in(tx,ty)&&maze[tx][ty]=='#') {
				count++;
			}
		}
	}
	public static boolean in(int x,int y) {
		return 0<=x && x<n && 0<=y && y<m;
	}
}
