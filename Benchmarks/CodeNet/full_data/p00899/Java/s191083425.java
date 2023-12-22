import java.util.Arrays;
import java.util.Scanner;


public class Main{
	Scanner scan = new Scanner(System.in);
	String s[] = new String[20];
	int [][] g = new int[20][20];
	int [][] vis = new int[1 << 15][14];
	int [][] d = new int[1 << 15][14];
	//int [][] tp = new int[1 << 14][14];
	int n;
	int cao(int i, int j){
		int l = s[j].length();
		for(; l != 0; l--){
			if(s[i].endsWith(s[j].substring(0, l))) return l;
		}
		return 0;
	}
	int min(int a, int b){
		return a < b ? a : b;
	}
	
	int dp(int st, int id){
		if(vis[st][id] == 1) return d[st][id];
		vis[st][id] = 1;
		int ans = 20 * 30;
		int ok = 1;
		for(int i = 0; i < n; i++) if(((st >> i) & 1) == 1){
			if(i == id) continue;
			ok = 0;
			ans = min(ans, dp(st - (1 << id), i) - g[i][id] + s[id].length());
		}
		
		if(ok == 1) ans = s[id].length();
		return d[st][id] = ans;
		
	}
	void solve(){
		//int n;
		while(scan.hasNext()){
			n = scan.nextInt();
			scan.nextLine();
			if(n == 0) break;
			for(int i = 0; i < vis.length; i++)
				Arrays.fill(vis[i], 0);
		//	for(int i = 0; i < (1 << n); i++)
			//	Arrays.fill(tp[i], 20 * 30);
			int sz = 0;
			String sp;
			for(int i = 0; i < n; i++){
				sp = scan.nextLine();
				int ok = 1;
				for(int j = 0; j < sz; j++){
					if(s[j].contains(sp)){
						ok = 0; break;
					}
				}
				if(ok == 1) s[sz++] = sp;
			}
			n = sz;
		//	for(int i = 0; i < (1 << n); i++)
			//	Arrays.fill(tp[i], 20 * 30);
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					g[i][j] = cao(i, j);
				}
			}
			int ans = 20 * 30;
			for(int i = 0; i < n; i++){
				ans = min(ans, dp((1 << n) - 1, i));
			}
			
			System.out.println(ans);
		}
	}
	public static void main(String [] args){
		new Main().solve();
	}
}