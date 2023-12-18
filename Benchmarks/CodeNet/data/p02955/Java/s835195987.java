import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();

		long sum = 0;
		for(int i=0; i<N; i++)
			sum += A[i];
		
		ArrayList<Integer> factor = new ArrayList<>();
		for(int i=1; (long)i*i<=sum; i++)
			if(sum%i==0)
				factor.add(i);
		
		for(int i=0; i<factor.size(); i++) {
			long gcd = sum/factor.get(i);
			if(check(A, K, gcd)) {
				System.out.println(gcd);
				sc.close();
				return;
			}
		}
		
		for(int i=0; i<factor.size(); i++) {
			long gcd = factor.get(factor.size()-i-1);
			if(check(A, K, gcd)) {
				System.out.println(gcd);
				sc.close();
				return;
			}
		}
	}
	
	static boolean check(int[] A, long K, long gcd) {
		int N = A.length;
		int[] norm = A.clone();
		for(int i=0; i<N; i++)
			norm[i] %= gcd;
		
		Arrays.sort(norm);
		if(norm[N-1]==0)
			return true;
		
		long sum = 0;
		for(int i=0; i<N; i++) {
			sum += norm[i];
		}
		
		long operation = 0;
		for(int i=0; i<N-sum/gcd; i++)
			operation += norm[i];

		return operation <= K;
		
	}
}
