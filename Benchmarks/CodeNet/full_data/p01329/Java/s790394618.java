import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	static char get(int k){
		return k==0?'U':k==1?'R':k==2?'D':'L';
	}
	static int get(char k){
		return k=='U'?0:k=='R'?1:k=='D'?2:3;
	}
	static class V{
		public int ID;
		public V[] c;
		public boolean leaf;
		public V(int ID) {
			this.ID = ID;
			leaf = false;
			c = new V[4];
		}
		public void make(String s, int k){
			if(k==s.length()){
				leaf = true;
				return;
			}
			int d = get(s.charAt(k));
			if(c[d]==null){
				v[id] = new V(id);
				c[d] = v[id];
				id++;
			}
			c[d].make(s, k+1);
		}
		public int trans(int dir){
			if(c[dir]!=null){
				return !leaf?c[dir].ID:-1;
			}
			int x = faillink[ID];
			if(x==-1)return 0;
			return v[x].trans(dir);
		}
	}

	static int id;
	static V[] v;
	static int[] faillink;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if((h|w)==0)break;
			int si = -1;
			int sj = -1;
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++){
				char[] c = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					map[i][j] = c[j];
					if(c[j]=='S'){
						si = i;
						sj = j;
					}
				}
			}
			int p = sc.nextInt();
			String[] pat = new String[p];
			v = new V[150];
			id = 0;
			v[0] = new V(id++);
			for(int i=0;i<p;i++){
				pat[i]=sc.next();
				v[0].make(pat[i], 0);
			}
			faillink = new int[id];
			faillink[0] = -1;
			List<Integer> l = new ArrayList<Integer>();
			l.add(0);
			while(!l.isEmpty()){
				List<Integer> next = new ArrayList<Integer>();
				for(int i:l){
					for(int k=0;k<4;k++){
						if(v[i].c[k]!=null){
							next.add(v[i].c[k].ID);
							int x = faillink[i];
							while(x!=-1){
								if(v[x].c[k]!=null){
									faillink[v[i].c[k].ID] = v[x].c[k].ID;
									break;
								}
								x = faillink[v[x].ID];
							}
							if(x==-1)faillink[v[i].c[k].ID] = 0;
						}
					}
				}
				l = next;
			}
//			for(int i=0;i<id;i++)System.out.println("F["+i+"] = " + faillink[i]);
			//faillink : OK
			int [][][] dp = new int[h][w][id];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)for(int k=0;k<id;k++)dp[i][j][k]=Integer.MAX_VALUE;
			List<int[]> list = new ArrayList<int[]>();
			list.add(new int[]{si,sj,0});
			dp[si][sj][0] = 0;
			int ans = Integer.MAX_VALUE;
			while(!list.isEmpty()){
				List<int[]> next = new ArrayList<int[]>();
				for(int[] a:list){
					int i = a[0];
					int j = a[1];
					int k = a[2];
					if(map[i][j]=='G'){
						ans = Math.min(ans, dp[i][j][k]);
//						break;
					}
					for(int m=0;m<4;m++){
						int ni = i+move[m][0];
						int nj = j+move[m][1];
						if(0<=ni&&ni<h&&0<=nj&&nj<w&&map[ni][nj]!='#'){
							int x = v[k].trans(m);
							if(x==-1 || v[x].leaf)continue;
							if(dp[i][j][k]+1 < dp[ni][nj][x]){
								dp[ni][nj][x] = dp[i][j][k]+1;
								next.add(new int[]{ni,nj,x});
							}
						}
					}
				}
				list = next;
			}
			System.out.println(ans==Integer.MAX_VALUE?-1:ans);
		}
	}
}