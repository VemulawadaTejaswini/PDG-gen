

import java.util.LinkedList;
import java.util.Scanner;

/**
 * ?目： CAD算法第二周A?   aizu0558
 * 描述：利用广度?先搜索
 * @author jack
 *
 */
public class Main {
	static int[][] vis = new int[1000][1000];
	static P[] aim = new P[11];
	 P s = new P();
	 P g = new P();
	
	int[] dx = {1,0,-1,0};
	int[] dy = {0,1,0,-1};
	static int n,w,h;
	int step;
	
	public int bfs(P s, P g,char[][] graph){
		LinkedList<P> que = new LinkedList<>();
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				vis[i][j] = -1;
			}
		}
		que.add(s);
		vis[s.x][s.y] = 0;
		while(que.size() != 0){
			P p = que.remove();
			//que.pop();
			if (p.x == g.x && p.y == g.y) {
				break;
			}
			for (int i = 0; i < 4; i++) {
				P n = new P();
				n.x = p.x + dx[i];
				n.y = p.y + dy[i];
				if(0<=n.x&&n.x<h&&0<=n.y&&n.y<w&&graph[n.x][n.y]!='X'&&vis[n.x][n.y]==-1){
		             
					   que.add(n);
		               vis[n.x][n.y]=vis[p.x][p.y]+1;
		           }
			}
		}
		return vis[g.x][g.y];
	}
	
	public void run(char[][] graph){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(graph[i][j] <= '9'  && graph[i][j] >= '1'){
					int t=graph[i][j] - '0';
					aim[t] = new P();
					aim[t].x = i;
					aim[t].y = j;
				}
				else if(graph[i][j] == 's'){
					s.x = i;
					s.y = j;
					graph[i][j] = '.';
				}
				//System.out.println("aaaaaaaaaaaaa");
			}
		}
			
			for(int e = 1; e <= n; e++){
				g.x = aim[e].x;
				g.y = aim[e].y;
				step += bfs(s,g,graph);
				s.x = g.x;
				s.y = g.y;
				graph[g.x][g.y] = '.';
			}
		System.out.printf("%d hhhh",step);
	}
	
	
	
	public static void main(String[] args) {
		//char[][] graph = new char[101][101];
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		
		sc.nextLine();
		char[][] graph = new char[h][];
		for(int i = 0; i < h; i++){
			graph[i]= sc.nextLine().trim().toCharArray();
		}
		for(int l =0; l<h;l++){
			for(int p =0; p < w; p++){
				System.out.print(graph[l][p]);
			}
		}
		Main em = new Main();
		em.run(graph);
		sc.close();
		
		
	}
public class P{
	int x;
	int y;
}
}