import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			int[][] s_wall = new int [h][w+1];
			int[][] u_wall = new int [h+1][w];
			for(int i=0;i<h;++i) {
				s_wall[i][0]=1;
				for(int j=1;j<w;++j){
					s_wall[i][j] = sc.nextInt();
				}
				s_wall[i][w] = 1;
				if(i==h-1) {
					for(int j=0;j<w;++j) {
						u_wall[0][j] = 1;
						u_wall[i+1][j] = 1;
					}
				} else {
					for(int j=0;j<w;++j) {
						u_wall[i+1][j] = sc.nextInt();
					}
				}
			}
			int[][] map = new int[h][w];
			Queue<Node> que = new LinkedList<Node>();
			map[0][0]=1;
			que.add(new Node(0,0));
			while(!que.isEmpty()) {
				Node cur = que.remove();
				if(cur.y!=0 && u_wall[cur.y][cur.x]==0) {
					if(map[cur.y-1][cur.x]==0 || map[cur.y-1][cur.x]>map[cur.y][cur.x]) {
						que.add(new Node(cur.x,cur.y-1));
						map[cur.y-1][cur.x]=map[cur.y][cur.x]+1;
					}
				}
				if(cur.y!=h-1 && u_wall[cur.y+1][cur.x]==0) {
					if(map[cur.y+1][cur.x]==0 || map[cur.y+1][cur.x]>map[cur.y][cur.x]) {
						que.add(new Node(cur.x,cur.y+1));
						map[cur.y+1][cur.x]=map[cur.y][cur.x]+1;
					}
				}
				if(cur.x!=0 && s_wall[cur.y][cur.x]==0) {
					if(map[cur.y][cur.x-1]==0 || map[cur.y][cur.x-1]>map[cur.y][cur.x]) {
						que.add(new Node(cur.x-1,cur.y));
						map[cur.y][cur.x-1]=map[cur.y][cur.x]+1;
					}
				}
				if(cur.x!=w-1 && s_wall[cur.y][cur.x+1]==0) {
					if(map[cur.y][cur.x+1]==0 || map[cur.y][cur.x+1]>map[cur.y][cur.x]) {
						que.add(new Node(cur.x+1,cur.y));
						map[cur.y][cur.x+1]=map[cur.y][cur.x]+1;
					}
				}
			}
			System.out.println(map[h-1][w-1]);
		}
	}
}

