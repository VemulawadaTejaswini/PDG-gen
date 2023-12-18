import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		
		int[] coef = new int[N];
		for(int i=0; i<N-1; i++) {
			if(i%2==0) {
				coef[i]++;
				coef[i+1]--;
			} else {
				coef[i]--;
				coef[i+1]++;
			}
		}
		Arrays.sort(coef);
		long sum1 = 0;
		for(int i=0; i<N; i++)
			sum1 += (long)coef[i]*A[i];

		Arrays.fill(coef, 0);
		for(int i=0; i<N-1; i++) {
			if(i%2==0) {
				coef[i]--;
				coef[i+1]++;
			} else {
				coef[i]++;
				coef[i+1]--;
			}
		}
		Arrays.sort(coef);
		long sum2 = 0;
		for(int i=0; i<N; i++)
			sum2 += (long)coef[i]*A[i];
		
		System.out.println(Math.max(sum1, sum2));
		sc.close();
	}
}
