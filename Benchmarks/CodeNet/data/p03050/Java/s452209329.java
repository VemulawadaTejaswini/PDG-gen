import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		long ans = 0;
		
		for(long mod=1; (N-mod)/mod > mod; mod++) {
			if((N-mod)%mod==0)
				ans += (N-mod)/mod;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
