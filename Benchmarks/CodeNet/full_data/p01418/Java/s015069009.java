import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static final int MAX_TIME = 12;
	
	public static final double EPS = 1e-10;
	
	public static double dfs(final int K, int day, double r, double l, final double PP, final double P, final double E, final double T){	
		if(T - E > l){
			return 0;
		}
		
		if(T + E < r){
			return 0;
		}
		
		final double H = (r + l) / 2;
		
		//System.out.println(day + " " + r + " " + l + " " + PP + " " + H);
		
		if(day >= K){
			if(Math.abs(T - H) <= E){
				return PP;
			}else{
				return 0;
			}
		}
		
		double ret = 0;
		
		if(H >= T){
			ret += dfs(K, day + 1, r, H, PP * (1.0 - P), P, E, T);
			ret += dfs(K, day + 1, H, l, PP * P, P, E, T);
		}else{
			ret += dfs(K, day + 1, H, l, PP * (1.0 - P), P, E, T);
			ret += dfs(K, day + 1, r, H, PP * P, P, E, T);
		}
		
		return ret;
	}

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int K = sc.nextInt();
		final int R = sc.nextInt();
		final int L = sc.nextInt();
		
		final double P = sc.nextDouble();
		final double E = sc.nextDouble();
		final double T = sc.nextDouble();
		
		System.out.printf("%.6f\n", dfs(K, 0, R, L, 1, P, E, T));
		
	}

}