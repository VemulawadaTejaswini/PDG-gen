import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int N = Integer.parseInt(S[0]);
		int W = Integer.parseInt(S[1]);
		int[] weight = new int[N+1];
		int[] value = new int[N+1];
		
		
		for(int i = 1; i <= N ; i++) {
			S = br.readLine().split(" ");
			weight[i] = Integer.parseInt(S[0]);
			value[i] = Integer.parseInt(S[1]);
		}
		
		long[] preCache = new long[W+1];
		long[] currCache = new long[W+1];
		
		
		for(int i = 0; i <= W; i++) {
			if(i >= weight[1]) {
				preCache[i] = value[1];
			}
		}
		
		for(int i = 2; i <= N ; i++) {
			for(int w = 1; w <= W ; w++) {
				currCache[w] = preCache[w];
				if(w >= weight[i]) {
					currCache[w] = Math.max(currCache[w], value[i] + preCache[w-weight[i]]);
				}
			}
			preCache = currCache;
			currCache = new long[W+1];
		}
		
		System.out.println(preCache[W]);
	}
}
