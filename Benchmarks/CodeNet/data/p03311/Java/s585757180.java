import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt()-i;
		
		Arrays.sort(A);
		long ans = 0;
		for(int i=0; i<N; i++)
			ans += Math.abs(A[i]-A[N/2]);
		
		System.out.println(ans);
		sc.close();
	}
}
