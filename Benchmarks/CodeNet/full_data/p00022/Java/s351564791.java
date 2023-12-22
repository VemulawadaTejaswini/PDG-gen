import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int N;
	private static int[] a;
	private static int max_sum;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			
			N = Integer.parseInt(line);
			if(N == 0){
				break;
			}
			
			a = new int[N];
			max_sum = 0;
			for (int i = 0; i < N; i++) {
				a[i] = Integer.parseInt(br.readLine());
				max_sum = max_sum + a[i];
			}

			for(int i=0;i<N;i++){
				if(a[i]<0 && (i == N-1 || a[i+1]>=a[i])){
					continue;
				}
				int sum = 0;
				for(int j=i;j<N;j++){
					sum = sum + a[j];
					if(sum > max_sum){
						max_sum = sum;
					}
				}
			}
			System.out.println(max_sum);
		}
	}
}