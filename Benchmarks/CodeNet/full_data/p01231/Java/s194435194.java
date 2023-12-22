import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Aaron and Bruce
public class Main{

	int n, INF = 1<<29, res;
	int[][] wf;
	boolean[][] e, u;
	
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
			List<int[]> l = new ArrayList<int[]>();
			l.add(new int[]{pa, pb});
			int step = 0;
			while(!l.isEmpty()&&step<=n){
				List<int[]> next = new ArrayList<int[]>();
				for(int[]v:l){
					int a = v[0], b = v[1];
					if(a==b)continue;
					for(int k=0;k<n;k++){
						if(!e[a][k]||wf[b][k]<=1)continue;
						for(int j=0;j<n;j++){
							if(!e[b][j]||j==b||wf[b][k]<=wf[j][k])continue;
							next.add(new int[]{k, j});
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