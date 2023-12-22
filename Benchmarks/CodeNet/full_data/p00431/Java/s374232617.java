import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//String With Rings
public class Main{

	int n, INF = 1<<29;
	Set<Integer>[] adj;
	boolean[] v;
	int[][] e;
	int[] deg;

	boolean dfs(int k, int d, int T, int pre){
//		System.out.println("K:"+k+" D:"+d);
		if(d==T)return true;
		for(int x:adj[k]){
			if(x!=pre&&T<=d+e[k][x])return true;
			if(!v[x]){
				v[x] = true;
				if(dfs(x, d+1+e[k][x], T, k))return true;
				v[x] = false;
			}
		}
		return false;
	}
	
	int f(int k){
		int res = 0;
		for(int x:adj[k])if(!v[x]){
			v[x] = true;
			res = f(x); break;
		}
		return res+1;
	}

	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt();
			if(n==0)break;
			adj = new Set[101];
			for(int i=1;i<101;i++)adj[i]=new HashSet<Integer>();
			Set<Integer> set = new HashSet<Integer>();
			e = new int[101][101];
			deg = new int[101];
			for(int[]a:e)Arrays.fill(a, -1);
			while(n--!=0){
				int a = sc.nextInt(), b = sc.nextInt();
				set.add(a); set.add(b);
				e[a][b] = e[b][a] = 0;
				adj[a].add(b); adj[b].add(a);
			}
			int M = 0;
			v = new boolean[101];
			for(int s:set){
				Arrays.fill(v, false);
				v[s] = true;
				M = Math.max(M, f(s));
			}
			int N = set.size();
			for(int i=1;i<101;i++)deg[i]=adj[i].size();
			for(int i=1;i<101;i++)if(deg[i]==2){
//				System.out.println("I:"+i);
				int[] t = new int[2];
				int id = 0;
				for(int x:adj[i])t[id++]=x;
//				System.out.println(t[0]+" "+t[1]);
				int j = t[0], k = t[1];
//				System.out.println("E:"+e[j][k]);
				if(e[j][k]!=-1)continue;
				deg[i] = 0;
				//				if(adj[j]==null)System.out.println("J:"+j);
				//				if(adj[k]==null)System.out.println("K:"+k);
				adj[j].remove(i); adj[k].remove(i);
				adj[j].add(k); adj[k].add(j);
				e[j][k] = e[k][j] = e[i][j]+e[i][k]+1;
				set.remove(i);
			}
			int res = 0;
			int s = 0;
			for(int i=M;i<=N;i++){
				while(s<101&&!set.contains(s))s++;
				if(s==101)break;
				Arrays.fill(v, false);
				v[s] = true;
//				System.out.println("R: "+i+" Start:"+s);
				if(dfs(s, 1, i, -1)){
					res = i;
				}
				else {
					s++; i--;
				}
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}