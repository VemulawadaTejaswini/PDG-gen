import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] ps = new int[n][d];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < d; j++){
				ps[i][j] = sc.nextInt();
			}
		}
		int res = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(calc(ps, n, d, i, j)) {
					res++;
				}
			}
		}
		System.out.println(res);
	}
	static boolean calc(int[][] ps, int n, int d, int i, int j){
		int s = 0;
		for(int k = 0; k < d; k++){
			s += (ps[i][k] - ps[j][k])*(ps[i][k] - ps[j][k]);
		}
		int sq = (int)Math.sqrt(s);
		return sq*sq == s;
	}

}
