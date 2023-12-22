import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int MAX = 100; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		String[] in;
		int[] a = new int[MAX + 1];
		for(int i = 0; i < n; ++i){
			in = br.readLine().split(" ");
			a[i] = Integer.parseInt(in[0]);
			a[i+1] = Integer.parseInt(in[1]);
		}
		
		long[][] cost = new long[MAX][MAX];
		calcCost(a, cost);
		
		System.out.println(cost[0][n-1]);
	}
	public static void calcCost(int[] a, long[][] cost){
		int n = cost.length;
		for(int k = 0; k < n; k++){
			for(int i = 0; i + k < n; i++){
				if(k == 0){
					cost[i][k] = 0;
					continue;
				}
				cost[i][k] = Long.MAX_VALUE;
				for(int j = 0; j < k; j++){
					long c = cost[i][j] + cost[i+j+1][k-j-1] + a[i]*a[i+j+1]*a[i+k+1]; 
					if(c < cost[i][k]){
						cost[i][k] = c;
					}
				}
			}
		}

	}

}