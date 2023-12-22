import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int N;
	private static int[] a;
	private static int max_sum;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while ((N = Integer.parseInt(br.readLine())) != 0) {
			
			a = new int[N];
			max_sum = 0;
			for (int i = 0; i < N; i++) {
				a[i] = Integer.parseInt(br.readLine());
				max_sum = max_sum + a[i];
			}

			for(int i=0;i<N;i++){
				if(a[i]<0 && a[i+1]>=a[i]){
					continue;
				}
				int sum = a[i];
				for(int j=i+1;j<N;j++){
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