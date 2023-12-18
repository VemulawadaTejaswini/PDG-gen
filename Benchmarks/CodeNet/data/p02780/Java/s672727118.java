import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] p = new double[N];
		double[] S = new double[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextDouble();
		}
		double sum = 0;
		for(int i = 0; i < N; i++) {
			sum  += (p[i]+1)/2;
			S[i] = sum;
		}
		int i = N-1;
		double R = 0;
		while(K<i&&i<N) {
			if(S[i]-S[i-K]>=S[i-1]-S[i-K-1]) {
				R = S[i]-S[i-K];
			}
			i--;
		}
		System.out.println(R);
	}	
}