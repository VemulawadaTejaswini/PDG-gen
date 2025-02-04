import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//Ice Maze
public class Main{

	int w, h, si, sj, gi, gj, INF = 1<<29, res;
	int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
	int[] dist, ice, hit;
	int[][] id;
	char[][] m;
	boolean[][] v;
	
	Comparator<Integer> com = new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return dist[o1]-dist[o2];
		}
	};
	
	void mark(int i, int j, int x){
		id[i][j] = x;
		ice[x]++;
		for(int k=0;k<4;k++){
			int ni = i+d[k][0], nj = j+d[k][1];
			if(0<=ni&&ni<h&&0<=nj&&nj<w&&m[ni][nj]=='X'&&id[ni][nj]==0)mark(ni, nj, x);
		}
	}
	
	boolean f(int i, int j, int depth, int limit){
		if(limit<depth+dist[i*w+j])return false;
		if(gi==i&&gj==j){
			return true;
		}
		List<Integer> l = new ArrayList<Integer>(3);
		for(int k=0;k<4;k++){
			int ni = i+d[k][0], nj = j+d[k][1];
			if(0<=ni&&ni<h&&0<=nj&&nj<w&&m[ni][nj]!='#'&&!v[ni][nj])l.add(ni*w+nj);
		}
		Collections.sort(l, com);
		for(int V:l){
			int ni = V/w, nj = V%w;
			if(ice[id[ni][nj]]>>1 >= hit[id[ni][nj]]+1){
				hit[id[ni][nj]]++;
				v[ni][nj] = true;
				if(f(ni, nj, depth+1, limit))return true;
				v[ni][nj] = false;
				hit[id[ni][nj]]--;
			}
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		dist = new int[144];
		ice = new int[144];
		hit = new int[144];
		for(;;){
			w = sc.nextInt(); h = sc.nextInt();
			if((w|h)==0)break;
			m = new char[h][];
			for(int i=0;i<h;i++){
				m[i] = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(m[i][j]=='S'){
						m[i][j] = '.'; si = i; sj = j;
					}
					if(m[i][j]=='G'){
						m[i][j] = '.'; gi = i; gj = j;
					}
				}
			}
			Arrays.fill(dist, INF);
			dist[gi*w+gj] = 0;
			Queue<Integer> que = new LinkedList<Integer>();
			que.add(gi*w+gj);
			while(!que.isEmpty()){
				int V = que.poll();
				int pi = V/w, pj = V%w;
				for(int k=0;k<4;k++){
					int ni = pi+d[k][0], nj = pj+d[k][1];
					if(0<=ni&&ni<h&&0<=nj&&nj<w&&m[ni][nj]!='#'&&dist[ni*w+nj]==INF){
						dist[ni*w+nj] = dist[V]+1;
						que.add(ni*w+nj);
					}
				}
			}
			Arrays.fill(ice, 0);
			ice[0] = INF;
			id = new int[h][w];
			int ID = 1;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				if(m[i][j]!='X'||id[i][j]>0)continue;
				mark(i, j, ID++);
			}
			int L = 1, R = h*w;
			while(R-L>1){
				int M = (L+R)/2;
				Arrays.fill(hit, 0);
				v = new boolean[h][w];
				v[si][sj] = true;
				if(f(si, sj, 0, M))R=M;
				else L=M;
			}
			System.out.println(R);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}