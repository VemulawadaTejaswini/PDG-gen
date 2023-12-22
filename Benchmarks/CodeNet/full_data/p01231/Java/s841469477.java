import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Aaron and Bruce
public class Main{

	int n, INF = 1<<29, res, M = 50;
	int[][] wf;
	boolean[][] e;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0){
			n = sc.nextInt();
			wf = new int[n][n];
			e = new boolean[n][n];
			for(int[]a:wf)Arrays.fill(a, INF);
			for(int i=0;i<n;i++)wf[i][i]=0;
			for(int i=0;i<n;i++)for(int j=0;j<n;j++){
				e[i][j] = sc.nextInt()==1;
				if(e[i][j])wf[i][j]=1;
			}
			for(int i=0;i<n;i++)e[i][i] = true;
			for(int k=0;k<n;k++)for(int i=0;i<n;i++)for(int j=0;j<n;j++)wf[i][j]=Math.min(wf[i][j], wf[i][k]+wf[k][j]);
			int pa = sc.nextInt(), pb = sc.nextInt();
			if(wf[pa][pb]==INF){
				System.out.println("infinity"); continue;
			}
			Set<Integer> l = new HashSet<Integer>();
			l.add(pa*M+pb);
			int step = 0;
			while(!l.isEmpty()&&step<=n){
				Set<Integer> next = new HashSet<Integer>();
				for(int v:l){
					int a = v/M, b = v%M;;
					if(a==b)continue;
					for(int k=0;k<n;k++){
						if(!e[a][k]||wf[b][k]<=1)continue;
						for(int j=0;j<n;j++){
							if(!e[b][j]||j==b||wf[b][k]<=wf[j][k])continue;
							next.add(k*M+j);
						}
					}
				}
				step++;
				l = next;
			}
			System.out.println(n<step?"infinity":step);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}