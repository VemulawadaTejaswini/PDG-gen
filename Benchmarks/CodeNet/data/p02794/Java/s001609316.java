import java.math.*;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	ArrayList<Integer>[] g;
	int[] parent;
	int[] height;
	
	void dfs(int cur,int par) {
		parent[cur]=par;
		for(int dst:g[cur]) {
			if(dst==par)continue;
			height[dst]=height[cur]+1;
			dfs(dst,cur);
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[][] connected=new boolean[N][N];
		g=new ArrayList[N];
		parent=new int[N];
		height=new int[N];
		Arrays.fill(parent, -1);
		for(int i=0;i<N;++i)g[i]=new ArrayList<Integer>();
		for(int i=0;i<N-1;++i) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			--a;
			--b;
			g[a].add(b);
			g[b].add(a);
			connected[a][b]=true;
			connected[b][a]=true;
		}
		dfs(0,-1);
		int M = sc.nextInt();
		int[] u=new int[M];
		int[] v=new int[M];
		for(int i=0;i<M;++i) {
			u[i]=sc.nextInt();
			v[i]=sc.nextInt();
			--u[i];
			--v[i];
		}
		long ans=0;
		for(int s=0;s<(1<<M);++s) {
			boolean[][] banned=new boolean[N][N];
			for(int shift=0;shift<M;++shift) {
				if((s>>shift)%2==0)continue;
				int curu=u[shift];
				int curv=v[shift];
				while(curu!=curv) {
					if(height[curu]<height[curv]) {
						curu^=curv;
						curv^=curu;
						curu^=curv;
					}
					banned[curu][parent[curu]]=true;
					banned[parent[curu]][curu]=true;
					curu=parent[curu];
				}
			}
			int ok=0;
			for(int i=0;i<N;++i) {
				for(int j=i+1;j<N;++j) {
					if(connected[i][j]&&!banned[i][j]) {
						++ok;
					}
				}
			}
			ans+=(Integer.bitCount(s)%2==0?1:-1)*(1L<<ok);
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
