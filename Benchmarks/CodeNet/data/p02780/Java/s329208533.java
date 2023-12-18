import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			double [] s = new double[N+1]; 
			int[]p = new int[N];
			for(int i = 0;i<N;i++) p[i] = scan.nextInt();
			
			for(int i = 0;i<N;i++) {
				s[i+1] = s[i]+(p[i]+1)/2.0; 
			}
			
			double max = 0;
			
			for(int i = 0;i<=N-K;i++) {
				double a = s[i+K]-s[i];
				
				if(max<a)max = a;
			}
			
			
			BigDecimal d = new BigDecimal(max);
			String str = String.format("%1$.7f", d);
			
			System.out.println(str);
			
			
 			
		}
		
		
	}
		

}