import java.util.Scanner;

public class Main {
	
	public static final double EPS = 0.0000001;
	
	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int t = sc.nextInt();
		
		double[] PROB = new double[t + 1];
		
		for(int i = 0; i <= t; i++){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			double prob_sum = 0;
			double exp = 0;
			
			for(int j = 0; j < m; j++){
				final int v = sc.nextInt();
				final double p = sc.nextDouble();
				
				prob_sum += p;
				exp += v * p;
			}
			
			PROB[i] = exp / prob_sum;
		}
		
		boolean flag = false;
		for(int i = 0; i < t; i++){
			if(PROB[t] + EPS < PROB[i]){
				flag = true;
				break;
			}
		}
		
		System.out.println(flag ? "YES" : "NO");
	}

}