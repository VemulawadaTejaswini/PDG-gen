import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] k = new int[100001];
		int[] g = new int[100001];
		int kmax = 0;
		int gmax = 0;
		int kid = 0;
		int gid = 0;
		for(int i = 1; i <= n; i++){
			int v = sc.nextInt();
			if(i%2 == 1){
				k[v]++;
				if(k[v] > kmax){
					kid = v;
					kmax = k[v];
				}
			}else{
				g[v]++;
				if(g[v] > gmax){
					gid = v;
					gmax = g[v];
				}
			}
		}
		if(gmax==n/2&&kmax==n/2&&kid==gid){
			System.out.print(n/2);
		}else{
			int ans = 0;
			Arrays.sort(g);
			Arrays.sort(k);
			for(int i = 99999; i > 0; i--){
				if(k[i] != 0){
					ans += k[i];
				}else{
					break;
				}
			}
			for(int i = 99999; i > 0; i--){
				if(g[i] != 0){
					ans += g[i];
				}else{
					break;
				}
			}
			System.out.print(ans);
		}
	}
}
