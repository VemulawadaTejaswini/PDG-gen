import java.util.Arrays;
import java.util.Scanner;

//Building Water Ways
public class Main{

	int h, w, N, M, res;
	int[][] m;
	int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
	int[] ni, nj, mi, mj;
	int[][] v;
	
	void dfs(int k, int step, int rest){
//		System.out.println("DFS:"+k+" "+step+" "+rest);
		if(res<=step)return;
		if(k==N+1){
			if(rest==0)res = Math.min(res, step);
			return;
		}
		dfs(k+1, step, rest);
		v[ni[k]][nj[k]] = k;
		f(k, ni[k], nj[k], step, rest);
		v[ni[k]][nj[k]] = 0;
	}
	
	void f(int k, int i, int j, int step, int rest){
//		System.out.println("F:"+k+" "+i+" "+j+" "+step+" "+rest);
//		debug(v);
		if(res<=step)return;
		if(rest==0){
			dfs(k+1, step, rest);
			return;
		}
		int c = 0;
		for(int x=0;x<4;x++){
			int pi = i+d[x][0], pj = j+d[x][1];
			if(m[pi][pj]<0 && m[pi][pj]!=-10 && k!=-m[pi][pj])return;
//			System.out.println("HREWE");
			
			if(0<v[pi][pj]&&k!=v[pi][pj])return;
			if(v[pi][pj]==k)c++;
		}
		if(2<c)return;
		if(m[i][j]==1)dfs(k+1, step, rest);
		for(int x=0;x<4;x++){
			int pi = i+d[x][0], pj = j+d[x][1];
			if(m[pi][pj]<0||v[pi][pj]!=0)continue;
			v[pi][pj] = k;
			f(k, pi, pj, step+1, rest-m[pi][pj]);
			v[pi][pj] = 0;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		ni = new int[9];
		nj = new int[9];
		mi = new int[9];
		mj = new int[9];
		for(;;){
			h = sc.nextInt(); w = sc.nextInt();
			if((h|w)==0)break;
			M = N = 0;
			m = new int[h][w];
			for(int i=0;i<h;i++){
				char[] s = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(s[j]=='#')m[i][j] = -10;
					if(s[j]=='.')m[i][j] = 0;
					if(s[j]=='P'){
						m[i][j] = -(N+1);
						ni[N+1] = i; nj[N+1] = j;
						N++;
					}
					if(s[j]=='*'){
						m[i][j] = 1;
						mi[M+1] = i; mj[M+1] = j;
						M++;
					}
				}
			}
//			debug(m);
			res = 100;
			v = new int[h][w];
			dfs(1, 0, M);
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