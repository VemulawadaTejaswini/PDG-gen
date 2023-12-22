import java.util.Scanner;

//Dragon Fantasy
public class Main{

	int n, hx, hy, dx, dy;
	int[][] p;
	double[] r;
	double EPS = 1e-8;
	
	boolean dfs(int k, int S, double t){
		if(S==(1<<n)-1)return true;
		int x = k==-1?hx:p[k][0], y = k==-1?hy:p[k][1];
		for(int i=0;i<n;i++){
			if(((S>>i)&1)>0)continue;
			if(r[i]<t+Math.hypot(x-p[i][0], y-p[i][1])+EPS)return false;
		}
		for(int i=0;i<n;i++){
			if(((S>>i)&1)>0)continue;
			if(r[i]>t+Math.hypot(x-p[i][0], y-p[i][1])){
				if(dfs(i, S+(1<<i), t+Math.hypot(x-p[i][0], y-p[i][1])))return true;
			}
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt(); hx = sc.nextInt(); hy = sc.nextInt(); dx = sc.nextInt(); dy = sc.nextInt();
			if((n|hx|hy|dx|dy)==0)break;
			p = new int[n][2];
			for(int i=0;i<n;i++)for(int j=0;j<2;j++)p[i][j]=sc.nextInt();
			r = new double[n];
			for(int i=0;i<n;i++)r[i]=Math.hypot(p[i][0]-dx, p[i][1]-dy);
			System.out.println(dfs(-1, 0, 0)?"YES":"NO");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}