import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] p = new double[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextDouble();
		}
		double sum = 0;
		for(int i =0; i < K; i++) {
			sum+=p[i];
		}
		double max = (sum+K)/2;
		for(int i = K; i < N; i++) {
			sum+= p[i]-p[i-K];
			if((sum+K)/2 > max) {
				max = (sum+K)/2;
			}
		}	
		System.out.println(max);
	}	
}