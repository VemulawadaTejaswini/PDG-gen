import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		int K = sc.nextInt();
		
		long ans = (N/K)*(N/K)*(N/K);
		if(K%2==0) {
			ans += ((N+K/2)/K)*((N+K/2)/K)*((N+K/2)/K);
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
