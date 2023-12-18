import java.util.*;

public class Main {
	long INF = (long)1 << 60;
	
	private long[][] warshallFloyd(long [][] pass){
		int n = pass.length;
		for(int j = 0; j < n; j++){
			for(int i = 0; i < n; i++){
				for(int k = 0; k < n; k++){
					pass[i][k] = Math.min(pass[i][k], pass[i][j] + pass[j][k]);
				}
			}
		}
		return pass;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			long [][] pass = new long[n][n];
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			
			for(int i = 0; i < m;i++){
				int from = sc.nextInt() - 1;
				int to = sc.nextInt() - 1;
				int cost =  sc.nextInt() * -1;
//				debug(from, to, cost);
				pass[from][to] = cost;
			}
			
			warshallFloyd(pass);
//			debug(pass);
			if(pass[0][0] < 0){
				System.out.println("inf");
				continue;
			}
			
			
			System.out.println(pass[0][n-1] * -1);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
