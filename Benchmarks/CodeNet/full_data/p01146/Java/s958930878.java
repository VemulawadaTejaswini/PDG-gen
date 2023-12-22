import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Princess in Danger
public class Main{

	int[][] dist;
	int INF = 1<<29, P = 107;

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int N = sc.nextInt(), M = sc.nextInt(), L = sc.nextInt(), K = sc.nextInt(), A = sc.nextInt(), H = sc.nextInt();
			if((N|M|L|K|A|H)==0)break;
			boolean[] ice = new boolean[N];
			ice[A] = ice[H] = true;
			while(L--!=0)ice[sc.nextInt()] = true;
			int[][] e = new int[N][N];
			for(int[]a:e)Arrays.fill(a, INF);
			while(K--!=0){
				int s = sc.nextInt(), t = sc.nextInt();
				e[s][t] = e[t][s] = sc.nextInt();
			}
			dist = new int[N][M+1];
			for(int[]a:dist)Arrays.fill(a, INF);
			dist[A][M] = 0;
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(N, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					int a = o1/P, b = o1%P, c = o2/P, d = o2%P;
					return dist[a][b]!=dist[c][d]?dist[a][b]-dist[c][d]:d-b;
				}
			});
			q.add(A*P+M);
			int res = INF;
			while(!q.isEmpty()){
				int v = q.poll();
				int pos = v/P, m = v%P;
				if(pos==H){
					res = dist[pos][m]; break;
				}
				for(int i=0;i<N;i++){
					if(e[pos][i]==INF)continue;
					for(int t=0;m+t<=M;t++){
						if(t>0&&!ice[pos])break;
						int nm = m+t-e[pos][i];
						if(nm<0)continue;
						int w = dist[pos][m]+t+e[pos][i];
						if(w<dist[i][nm]){
							q.remove(i*P+nm); dist[i][nm] = w; q.add(i*P+nm);
						}
					}
				}
			}
			System.out.println(res==INF?"Help!":res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}