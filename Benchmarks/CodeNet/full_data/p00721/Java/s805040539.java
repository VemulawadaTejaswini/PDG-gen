import java.util.*;

public class Main {
	int cnt, min;
	int[][] cost;
	
	void check(int[] perm){
		int sum = 0;
		for(int i=0;i<cnt-1;i++) sum += cost[perm[i]][perm[i+1]];
		min = Math.min(min, sum);
	}
	
	void makeperm(int k, int[] perm, boolean[] flag){
		if(k==cnt){
			check(perm);
		}else{
			for(int i=1;i<cnt;i++){
				if(flag[i]==true) continue;
				perm[k] = i;
				flag[i] = true;
				makeperm(k+1, perm, flag);
				flag[i] = false;
			}
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			char[][] map = new char[h][w];
			int[] x = new int[11];
			int[] y = new int[11];
			cnt = 1;
			for(int i=0;i<h;i++){
				String s = sc.next();
				for(int j=0;j<w;j++){
					char t = s.charAt(j);
					if(t=='o'){
						x[0] = j;
						y[0] = i;
					}else if(t=='*'){
						x[cnt] = j;
						y[cnt] = i;
						cnt++;
					}
					map[i][j] = t;
				}
			}
			
			cost = new int[cnt][cnt];
			int[] xx = new int[]{0,0,1,-1};
			int[] yy = new int[]{1,-1,0,0};
			boolean f = false;
			for(int i=0;i<cnt;i++){
				for(int j=i+1;j<cnt;j++){
					ArrayDeque<Integer> p = new ArrayDeque<Integer>();
					ArrayDeque<Integer> q = new ArrayDeque<Integer>();
					int[][] c = new int[h][w];
					for(int s=0;s<h;s++){
						for(int t=0;t<w;t++) c[s][t] = Integer.MAX_VALUE;
					}
					
					p.offer(x[i]);
					q.offer(y[i]);
					c[y[i]][x[i]] = 0;
					while(p.size()!=0){
						int u = p.poll();
						int v = q.poll();
						if(u==x[j] && v==y[j]) break;
						
						for(int s=0;s<4;s++){
							if(0<=u+xx[s] && u+xx[s]<w && 0<=v+yy[s] && v+yy[s]<h){
								if(map[v+yy[s]][u+xx[s]]!='x' && c[v][u]+1<c[v+yy[s]][u+xx[s]]){
									p.offer(u+xx[s]);
									q.offer(v+yy[s]);
									c[v+yy[s]][u+xx[s]] = c[v][u]+1;
								}
							}
						}
					}
					
					if(c[y[j]][x[j]]==Integer.MAX_VALUE){
						f = true;
						break;
					}
					cost[i][j] = cost[j][i] = c[y[j]][x[j]];
				}
				if(f==true) break;
			}
			
			if(f==false){
				min = Integer.MAX_VALUE;
				makeperm(1, new int[cnt], new boolean[cnt]);
				System.out.println(min);
			}else{
				System.out.println(-1);
			}
		}	
	}
		
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}