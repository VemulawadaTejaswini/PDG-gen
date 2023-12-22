import java.util.*;
 
public class Main { 
	public static int n;
	public static int m;
	public static int x;
	public static int[] kingakus;
	public static int[][] cs;
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		cs = new int[n][m];
		kingakus = new int[n];
		for(int i=0; i<n; i++){
			kingakus[i] = sc.nextInt();
			for(int j=0; j<m; j++){
				cs[i][j] = sc.nextInt();
			}
		}
		bitSearch();
	}

	static void bitSearch() {
		int ans = 200000000;
		for (int i = 0; i < (Math.pow(2, n)); i++) {
			boolean[] hantei = new boolean[n];
			int[] rikaido = new int[m];
			int kingaku = 0;
			for (int j = 0; j < n; j++) {
				if ((1 & i >> j) == 1) {
					hantei[j] = true;
				} else {
					hantei[j] = false;
				}
			}
			for(int j=0; j<n; j++){
				if(hantei[j]){
					kingaku += kingakus[j];
					for(int k=0; k<m; k++){
						rikaido[k] += cs[j][k];
					}
				}
			}
			boolean flag = true;
			for(int j=0; j<m; j++){
				if(rikaido[j] < x){
					flag = false;
					break;
				}
			}
			if(flag) {
				ans = Math.min(ans, kingaku);
			}
		}
		if(ans == 200000000) System.out.println(-1);
		else System.out.println(ans);
	}
}
