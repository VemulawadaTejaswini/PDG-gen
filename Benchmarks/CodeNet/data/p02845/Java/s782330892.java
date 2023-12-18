import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		int mod = (int)1e9+7; 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
		sc.close();
		
		int memo[] = new int[N];
		long ans = 1;
		for(int i=0;i<N;i++) {
			if(A[i]==0) {
				ans *= (3 - memo[A[i]]);
			}else {
				ans *= (memo[A[i]-1]-memo[A[i]]);
			}
			ans %= mod;
			memo[A[i]]++;
		}
		System.out.println(ans);
	}
}