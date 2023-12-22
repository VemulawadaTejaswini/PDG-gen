import java.util.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n, mm;
	static int[][] cost;
	static int INF = 999999999;
	
	static boolean read() {
		n = sc.nextInt();
		if(n == 0) return false;
		
		int from, to, c;
		cost = new int[100][100];
		for(int i = 0; i < 100; i++) Arrays.fill(cost[i], INF);
		for(int i = 0; i < 100; i++) cost[i][i] = 0;
		mm = 0;
		for(int i = 0; i < n; i++) {
			from = sc.nextInt(); to = sc.nextInt(); c = sc.nextInt();
			cost[from][to] = cost[to][from] = c;
			mm = max(mm, from); mm = max(mm, to);
		}
		
		return true;
		
	}
	
	static String solve() {
				
		for(int i = 0; i <= mm; i++) {
			for(int j = 0; j <= mm; j++) {
				for(int k = 0; k <= mm; k++) {
					cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j]);
				}
			}
		}
		
		int min = INF, idx = 100, sum;
		for(int i = 0; i <= mm; i++) {
			sum = 0;
			for(int j = 0; j <= mm; j++) {
				
					sum += cost[i][j];
				
			}
			if(sum < min) {
				idx = i;
				min = sum;
			}
		}
		
		return "" + idx + " " + min;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}