import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double[] P = new double[N+1];
		
		String[] S = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			P[i+1] = Double.parseDouble(S[i]);
		}
		
		int totalH = N/2 + 1;
		int totalT = N/2;
		
		double[][] cache = new double[N+1][totalT+1];
		cache[0][0] = 1;
		
		//only heads
		for(int i = 1; i <= N; i++) {
			cache[i][0] = P[i] * cache[i-1][0];
		}
		
		//only tails
		for(int i = 1; i <= totalT; i++) {
			cache[0][i] = (1- P[i]) * cache[0][i-1];
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= totalT; j++) {
				if(i +j > N) {
					continue;
				}
				
				cache[i][j] = (P[i+j] * cache[i-1][j]) + ((1- P[i+j]) * cache[i][j-1]);
			}
		}
		
		double result = 0;	
		while(totalT >= 0) {
			result += cache[totalH][totalT];
			totalT--;
			totalH++;
		}
		
		System.out.println(result);
	}
}
