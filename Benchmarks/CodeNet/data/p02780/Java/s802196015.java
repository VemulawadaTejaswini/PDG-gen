import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			List<Double> E = new ArrayList<Double>(); 
			
			Double pi = 0.0;
			
			
			for(int i=1;i<=N;i++) {
				pi = sc.nextDouble();
				E.add((pi+1.0)/2.0) ;
				
			}
			
			List<Double> sum = new ArrayList<Double>(); 
			
			for(int j=1;j<K-j+1;j++) {
				double SUM = 0;
				
				for(int m=j;m<=K;m++) {
					SUM += E.get(m);
				}
				
				sum.add(SUM);
			}
			
			double max=0.0;
			
			for(int n=1;n<N-K+1;n++) {
				if(max<sum.get(n)) {
					max = sum.get(n);
				}
				
			}
			
			System.out.println(max);
			
			
		}

	}