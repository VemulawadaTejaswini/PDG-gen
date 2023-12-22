import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

//The Two Men of the Japanese Alps
public class Main{

	int INF = 1<<29;
	double[][] dist;
	
	double calc(double x1, double y1, double x2, double y2){
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int[] xs = new int[100], ys = new int[100], y = new int[6000];
		double[] x = new double[6000];
		dist = new double[3000][3000];
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			Set<Integer> yset = new HashSet<Integer>();
//			int[] xs = new int[n], ys = new int[n];
			for(int i=0;i<n;i++){
				xs[i] = sc.nextInt();
				yset.add(ys[i]=sc.nextInt());
			}
			int[] Y = new int[yset.size()];
			int id = 0;
			for(int yy:yset)Y[id++]=yy;
			Arrays.sort(Y);
			id = 0;
//			int[] y = new int[6000];
			for(int i=0;i+1<n;i++){
				if(ys[i]==ys[i+1]){
					x[id] = xs[i];
					y[id++] = ys[i];
				}
				else if(ys[i]<ys[i+1]){
					for(int j=0;j<Y.length&&Y[j]<ys[i+1];j++){
						if(Y[j]<ys[i])continue;
						x[id] = (xs[i+1]-xs[i])*(Y[j]-ys[i]+0.)/(ys[i+1]-ys[i]) + xs[i];
						y[id++] = Y[j];
					}
				}
				else{
					for(int j=Y.length-1;j>=0&&Y[j]>ys[i+1];j--){
						if(Y[j]>ys[i])continue;
						x[id] = (xs[i+1]-xs[i])*(Y[j]-ys[i]+0.)/(ys[i+1]-ys[i]) + xs[i];
						y[id++] = Y[j];
					}
				}
			}
			x[id] = xs[n-1];
			y[id++] = 0;
			for(int i=0;i<id;i++)for(int j=0;j<id;j++)dist[i][j]=INF;
//			dist = new double[id][id];
//			for(double[]d:dist)Arrays.fill(d, INF);
			dist[0][id-1] = 0;
			PriorityQueue<int[]> q = new PriorityQueue<int[]>(id, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return (int)Math.signum(dist[o1[0]][o1[1]]-dist[o2[0]][o2[1]]);
				}
			});
			q.add(new int[]{0, id-1});
			double res = INF;
			while(!q.isEmpty()){
				int[] V = q.poll();
				int i = V[0], j = V[1];
				if(i==j){
					res = Math.min(res, dist[i][j]); continue;
				}
				for(int di=-1;di<=1;di++){
					int ni = i+di;
					if(ni<0 || id<=ni)continue;
					for(int dj=-1;dj<=1;dj++){
						int nj = j+dj;
						if(nj<0 || id<=nj || nj < ni || y[ni]!=y[nj])continue;
						double w = dist[i][j] + calc(x[i], y[i], x[ni], y[ni]) + calc(x[j], y[j], x[nj], y[nj]);
						if(w < dist[ni][nj]){
							dist[ni][nj] = w;
							q.add(new int[]{ni, nj});
						}
					}
				}
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}