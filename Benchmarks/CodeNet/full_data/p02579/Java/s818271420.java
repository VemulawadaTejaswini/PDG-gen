//package abc176;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static PrintWriter out;
	public static void main(String[] args) throws IOException {
		//Scanner sc=new Scanner(System.in);
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		out=new PrintWriter(System.out);
		
		
		String s[]=sc.readLine().split(" ");
		int n=Integer.valueOf(s[0]);
		int m=Integer.valueOf(s[1]);
		s=sc.readLine().split(" ");
		int sx=Integer.valueOf(s[0])-1;
		int sy=Integer.valueOf(s[1])-1;
		s=sc.readLine().split(" ");
		int ex=Integer.valueOf(s[0])-1;
		int ey=Integer.valueOf(s[1])-1;
		
		char a[][]=new char[n][m];
		for(int i=0;i<n;i++) {
			a[i]=sc.readLine().toCharArray();
		}
		
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(new Node(sx, sy));
		int ans[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			Arrays.fill(ans[i], Integer.MAX_VALUE/2);
		}
		ans[sx][sy]=0;
		int dx[]= {1,-1,0,0};
		int dy[]= {0,0,1,-1};
		while(!queue.isEmpty()) {
			Node vertex=queue.remove();
			for(int i=0;i<4;i++) {
				int nx=vertex.x+dx[i];
				int ny=vertex.y+dy[i];
				if(ok(nx,ny,n,m) && a[nx][ny]=='.' && ans[nx][ny]>ans[vertex.x][vertex.y]) {
					ans[nx][ny]=ans[vertex.x][vertex.y];
					queue.add(new Node(nx, ny));
				}
			}
			for(int i=-2;i<=2;i++) {
				for(int j=-2;j<=2;j++) {
					int nx=vertex.x+i;
					int ny=vertex.y+j;
					if(ok(nx,ny,n,m) && a[nx][ny]=='.' && ans[nx][ny]>ans[vertex.x][vertex.y]+1) {
						ans[nx][ny]=ans[vertex.x][vertex.y]+1;
						queue.add(new Node(nx, ny));
					}
				}
			}
		}
		
		if(ans[ex][ey]==Integer.MAX_VALUE/2) {
			out.println(-1);
		}
		else {
			out.println(ans[ex][ey]);
		}
		
		out.close();
		sc.close();
	}
	
	
	static boolean ok(int x,int y,int n,int m) {
		if(x>=0 && x<n && y>=0 && y<m)return true;
		return false;
	}
	static class Node{
		int x,y;
		Node(int a,int b){
			x=a;
			y=b;
		}
	}

}
