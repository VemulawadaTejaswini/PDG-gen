
import java.util.*;
public class Main {
	
	static int mod = (int)1e9+7;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
		
		long ans = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				ans += A[i]^A[j];
				ans %= mod;
			}
		}
		
		System.out.println(ans);
	}
}