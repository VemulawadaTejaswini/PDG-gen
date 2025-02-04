import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//Winter Bells
public class Main{

	int INF = 1<<28;
	int[][] wf;
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();){
			int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
			if((n|m|p)==0)break;
			int[][] e = new int[n][n];
			wf = new int[n][n];
			for(int[]a:e)Arrays.fill(a, INF);
			for(int[]a:wf)Arrays.fill(a, INF);
			for(int i=0;i<n;i++)wf[i][i]=0;
			while(m--!=0){
				int s = sc.nextInt(), t = sc.nextInt(), c = sc.nextInt();
				e[s][t] = e[t][s] = wf[s][t] = wf[t][s] = c;
			}
			for(int k=0;k<n;k++)for(int i=0;i<n;i++)for(int j=0;j<n;j++)wf[i][j]=Math.min(wf[i][j], wf[i][k]+wf[k][j]);
			List<Integer>[] adj = new List[n];
			for(int i=0;i<n;i++){
				adj[i] = new ArrayList<Integer>();
				for(int j=0;j<n;j++){
					if(e[i][j]==INF)continue;
					if(wf[0][i]+e[i][j]+wf[j][n-1]==wf[0][n-1])adj[i].add(j);
				}
			}
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return wf[0][o1]-wf[0][o2];
				}
			});
			for(int i=0;i<n;i++)q.add(i);
			double[] res = new double[n];
			res[0] = 1;
			while(!q.isEmpty()){
				int v = q.poll();
				for(int x:adj[v]){
					if(adj[v].size()==0)continue;
					res[x]+=res[v]/adj[v].size();
				}
			}
			while(p--!=0)System.out.printf("%.8f\n", res[sc.nextInt()]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}