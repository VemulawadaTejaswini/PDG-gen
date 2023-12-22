

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		StringTokenizer st1= new StringTokenizer(br.readLine());
		int sr=Integer.parseInt(st1.nextToken());
		int sc=Integer.parseInt(st1.nextToken());
		StringTokenizer st2= new StringTokenizer(br.readLine());
		int dr=Integer.parseInt(st2.nextToken());
		int dc=Integer.parseInt(st2.nextToken());
		
		char[][] maze=new char[h][w];
		for(int i=0;i<h;i++) {
			String s=br.readLine();
			for(int j=0;j<w;j++) {
				maze[i][j]=s.charAt(j);
			}
		}
		int ans=solve(maze,sr-1,sc-1,dr-1,dc-1);
		if(ans==Integer.MAX_VALUE) System.out.println(-1);
		else
			System.out.println(ans);

	}

	private static int solve(char[][] maze ,int sr, int sc, int dr, int dc) {
		if(sr<0 || sr>=maze.length || sc<0 || sc>=maze[0].length || maze[sr][sc]=='#')
			return Integer.MAX_VALUE;
		if(sr==dr && sc==dc) return 0;
		
		maze[sr][sc]='#';
		int n=solve(maze,sr-1,sc,dr,dc);
		int s=solve(maze,sr+1,sc,dr,dc);
		int w=solve(maze,sr,sc-1,dr,dc);
		int e=solve(maze,sr,sc+1,dr,dc);
		
		int ans=Integer.MAX_VALUE;
		if(n==Integer.MAX_VALUE && s==Integer.MAX_VALUE && w==Integer.MAX_VALUE && e==Integer.MAX_VALUE) {
			if(Math.abs(dr-sr)<=2 && Math.abs(dc-sc)<=2) return 1;
//			for(int i=-2;i<=2;i++) {
//				for(int j=-2;j<=2;j++) {
//					ans=Math.min(ans, 1+solve(maze,sr+i,sc+j,dr,dc));
//				}
//			}
//			return ans;
		}
		else {
			return Math.min(Math.min(n, s), Math.min(w, e)); 
		}
		
	}

}
