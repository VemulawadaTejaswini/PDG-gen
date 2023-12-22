
import java.awt.geom.*;
import java.util.*;
public class Main {
	
	boolean [] used;
	boolean flg, dup;
	int n,w,h, deepsize;
	int [][] data, ans;
	int [] hash;
	C[][] cand;
	P [] point;
	
	class C{
		HashSet<Integer> list;

		public C(HashSet<Integer> list) {
			this.list = list;
		}
	}
	
	class P{
		int x,y;

		public P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			w = sc.nextInt();
			h = sc.nextInt();
			n = sc.nextInt();
			if((w|h|n) == 0) break;
			hash = new int[n+1];
			deepsize = n;
			for(int i = 0; i < n; i++){
				int b = sc.nextInt();
				int k = sc.nextInt();
				hash[b] = k;
				if(k == 1) deepsize--;
			}
			data = new int[h][w];
			point = new P[n+1];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = sc.nextInt();
					if(data[i][j] > 0){
						point[data[i][j]] = new P(j, i);
					}
				}
			}
			
			used = new boolean[n+1];
			flg = false;
			dup = true;
			ans = new int[h][w];
			dfs(1);
			if(flg && dup){
				for(int i = 0; i < h; i++){
					System.out.print(ans[i][0]);
					for(int j = 1; j < w; j++){
						System.out.print(" " + ans[i][j]);
					}
					System.out.println();
				}
			}
			else{
				System.out.println("NA");
			}
		}
	}
	

	private void dfs(int deep) {
		if(deep == n + 1){
			if(flg){
				dup =false;
				return;
			}
			flg = true;
			for(int i = 0; i < h; i++){
				ans[i] = data[i].clone();
			}
			return ;
		}
		if(hash[deep] == 1){
			dfs(deep+1);
			return ;
		}
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(data[i][j] != 0 && data[i][j] != deep) continue;
				
				for(int k = i; k < h; k++){
					for(int l = j; l < w; l++){
						int dis = calcdis(j, i, l, k);
						if(used[deep]) continue;
						if(dis == hash[deep]){
							
							boolean res = check(j,i,l,k, deep);
							if(! res) continue;
							set(j,i,l,k, deep);
							used[deep] = true;
							dfs(deep + 1);
							used[deep] = false;
							set(j,i,l,k,0);
							data[point[deep].y][point[deep].x] = deep;
						}
					}
				}
				
			}
		}
		
		
	}
	
	private void disp(){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}


	private void set(int x1, int y1, int x2, int y2, int num) {
		
		for(int i = y1; i <= y2; i++){
			for(int j = x1; j <= x2; j++){
				data[i][j] = num;
			}
		}
	}


	private boolean check(int x1, int y1, int x2, int y2, int num) {
		boolean issameC = false;
		for(int i = y1; i <= y2; i++){
			for(int j = x1; j <= x2; j++){
				if(data[i][j] == num){
					issameC = true;
				}
				else if(data[i][j] != 0){
					return false;
				}
			}
		}
		if(issameC) return true;
		return false;
	}


	private int calcdis(int x1, int y1, int x2, int y2) {
		int res = (Math.abs(x1 - x2) + 1) * (Math.abs(y1 - y2) + 1);
		return res;
	}


	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}