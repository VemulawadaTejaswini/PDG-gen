import java.util.*;
 
public class Main { 
	public static int n;
	public static int m;
	public static int[][] cs;
	public static int[] ps;
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		cs = new int[m][n];
		for(int i=0; i<m; i++){
			int k = sc.nextInt();
			for(int j=0; j<k; j++){
				cs[i][j] = sc.nextInt();
			}
		}
		ps = new int[m];
		for(int i=0; i<m; i++){
			ps[i] = sc.nextInt();
		}
		int ans = bitSearch(n);
		System.out.println(ans);
	}

	static int bitSearch(int n) {
		int ans = 0;
		for (int i = 0; i < (Math.pow(2, n)); i++) {
			boolean[] flags = new boolean[n];
			for (int j = 0; j < n; j++) {
				if ((1 & i >> j) == 1) {
					flags[j] = true;
				} else {
					flags[j] = false;
				}
			}
			boolean flag=true;
			for(int j=0; j<cs.length; j++){
				int count = 0;
				for(int k: cs[j]){
					if(k != 0 && flags[k-1]) count++;
				}
				if(count%2!=ps[j]) flag=false; 
			}
			if(flag) ans++;
		}
		return ans;
	}
}
