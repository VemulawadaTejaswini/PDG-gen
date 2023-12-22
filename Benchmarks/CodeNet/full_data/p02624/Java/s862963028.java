import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long ans = 0;
		
		for(int i=1; i<=N; i++) {
			long num = N/i;
			ans += i*(num+1)*(num)/2;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
