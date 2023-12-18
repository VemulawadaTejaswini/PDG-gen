import java.util.*;

public class Main {
	final static int TRUE = 1;
	final static int FALSE = -1;
	final static int UNDICIDE = 0;

	public static int solve(int s[][], int n) {
		int max = (int)Math.pow(2, n);
		int ans = 0, a = 0;
		for(int i = 0; i < max; ++i){
			int current = 1;
			a = 0;
			boolean judg[] = new boolean[n];
			for(int j = 0; j < n; ++j){
				int tmp = current & i;
				if(tmp > 0){
					judg[j] = true;
					++a;
				}
				current *= 2;
			}

			for(int j = 0; j < n; ++j){
				if(judg[j]){
					for(int k = 0; k < n; ++k){
						if(judg[k] && s[j][k] == FALSE){
							a = 0;
							break;
						}
						if(!judg[k] && s[j][k] == TRUE){
							a = 0;
							break;
						}
					}
				}
			}
			ans = Math.max(ans, a);
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[][] = new int[n][n];
		for (int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			for (int j = 0; j < a; ++j) {
				int x = sc.nextInt(), y = sc.nextInt();
				if(y == 0) y = -1;
				s[i][x - 1] = y;
			}
		}
		sc.close();
		int ans = solve(s, n);
		System.out.println(ans);
	}
}
