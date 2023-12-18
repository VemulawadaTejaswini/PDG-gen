import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int N;
	static int[] A;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		String str = br.readLine();
		String[] word = str.split("\\s+");
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(word[i ]);
		}
		Arrays.sort(A);
		for (int i = 1; i <= N; i++) {
			compute(i);
		}

	}

	/**
	 * N=3*100000;
	 * 任取k个不同，remove  (N/k);
	 * 
	 * 
	 * 
	 * @param k
	 */
	
	private static void compute(int k){
		int res = 0 ;
		
		int i = 0;
		while( i < N ){
			int diff  = 0;
			int j = i;
			for(j=i;j<N;j++){
				if( j  == i ){
					diff++;
				}
				else if( A[j] != A[j-1]){
					diff++;
				}
				else{
					diff = diff +  0;
				}
				
				if( diff == k){
					res++;
					break;
				}
			}
			i  =  j + 1;
		}
		System.out.println(res);

}

}