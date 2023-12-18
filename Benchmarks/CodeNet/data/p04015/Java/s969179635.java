import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int A = scan.nextInt();
			
			int[] x = new int[N];
			
			long ans = 0;
			
			for(int i = 0; i<N; i++){
				x[i] = scan.nextInt();
			}
			double lim = Math.pow(2, N);
			
			for(long i = 0; i<lim; i++){
				long set = i;
				int sum = 0;
				int cnt = 0;
				for(int j = 0; j<N; j++){
					if((set & 1) > 0){
						cnt++;
						sum+=x[j];
					}
					set >>= 1;
				}
				double tmp = (double) sum/cnt;
				
				if(A - 0.0001 < tmp && tmp < A + 0.0001){
					ans++;
				}
			}

			System.out.println(ans);
		}
	}
}
