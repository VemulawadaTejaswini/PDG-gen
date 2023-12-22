import java.util.Arrays;
import java.util.Scanner;

//Winter Bells
public class Main{

	int[] d;
	void run(){
		Scanner sc = new Scanner(System.in);
		int INF = 1<<27;
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
			if((n|m|p)==0)break;
			int[][] wf = new int[n][n], e = new int[n][n];
			for(int[]a:wf)Arrays.fill(a, INF);
			for(int[]a:e)Arrays.fill(a, INF);
			for(int i=0;i<n;i++)wf[i][i]=0;
			while(m--!=0){
				int s = sc.nextInt(), t = sc.nextInt(), c = sc.nextInt();
				e[s][t] = e[t][s] = wf[s][t] = wf[t][s] = c;
			}
//			for(int k=0;k<n;k++)for(int i=0;i<n;i++)for(int j=0;j<n;j++)wf[i][j]=Math.min(wf[i][j], wf[i][k]+wf[k][j]);
//			d = new int[n];
//			for(int i=0;i<n;i++)d[i]=wf[0][i];
//			PriorityQueue<Integer> q = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
//				public int compare(Integer o1, Integer o2) {
//					return d[o1]-d[o2];
//				}
//			});
//			q.add(0);
			double[] r = new double[n];
			r[0] = 1;
//			boolean[] u = new boolean[n];
//			u[0] = true;
//			while(!q.isEmpty()){
//				int v = q.poll();
//				if(v==n-1)break;
//				int c = 0;
//				for(int i=0;i<n;i++){
//					if(i==v)continue;
//					if(wf[0][n-1]==wf[0][v]+e[v][i]+wf[i][n-1])c++;
//				}
//				for(int i=0;i<n;i++){
//					if(i==v)continue;
//					if(wf[0][n-1]==wf[0][v]+e[v][i]+wf[i][n-1]){
//						r[i]+=r[v]*1.0/c;
//						if(!u[i]){
//							u[i] = true; q.add(i);
//						}
//					}
//				}
//			}
			while(p--!=0)System.out.printf("%.8f\n", r[sc.nextInt()]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}