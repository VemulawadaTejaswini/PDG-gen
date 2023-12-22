import java.util.Arrays;
import java.util.Scanner;

//Chocolate with Heart Marks
public class Main{

	int h, w, res, N;
	int[] x, y, v;
	int[][] a;
	boolean[] u;
	
	void pf(String s){
		System.out.println(s);
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++)System.out.print((a[i][j]==0?0:1)+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	void calc(int k){
		if(k==N-1){
			int c = 0;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)c+=a[i][j]==0?1:0;
			res = Math.max(res, c);
			return;
		}
		int pi = y[v[k]], pj = x[v[k]], ni = y[v[k+1]], nj = x[v[k+1]];
		for(int i=pi;i!=ni;i+=(ni-pi)/Math.abs(ni-pi))a[i][pj]++;
		for(int j=pj;j!=nj;j+=(nj-pj)/Math.abs(nj-pj))a[ni][j]++;
//		if(k==0)pf("Pre:");
		calc(k+1);
		for(int i=pi;i!=ni;i+=(ni-pi)/Math.abs(ni-pi))a[i][pj]--;
		for(int j=pj;j!=nj;j+=(nj-pj)/Math.abs(nj-pj))a[ni][j]--;
//		if(k==0)pf("Afte:");
		
		for(int j=pj;j!=nj;j+=(nj-pj)/Math.abs(nj-pj))a[pi][j]++;
		for(int i=pi;i!=ni;i+=(ni-pi)/Math.abs(ni-pi))a[i][nj]++;
//		if(k==0)pf("Pre2:");
		calc(k+1);
		for(int j=pj;j!=nj;j+=(nj-pj)/Math.abs(nj-pj))a[pi][j]--;
		for(int i=pi;i!=ni;i+=(ni-pi)/Math.abs(ni-pi))a[i][nj]--;
//		if(k==0)pf("Afte2:");
	}
	
	void dfs(int k){
		if(k==N){
//			System.out.println("CALS");
			calc(0); return;
		}
		for(int i=0;i<N;i++)if(!u[i]){
			u[i] = true;
			v[k] = i;
			dfs(k+1);
			u[i] = false;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			h = sc.nextInt(); w = sc.nextInt();
			if((h|w)==0)break;
			N = 0;
			x = new int[6]; y = new int[6]; v = new int[6];
			u = new boolean[6];
			a = new int[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				a[i][j] = sc.nextInt();
				if(a[i][j]==1){
					a[i][j] = 10000; x[N] = j; y[N] = i; N++;
				}
			}
			res = 0;
			dfs(0);
			System.out.println(res);
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}