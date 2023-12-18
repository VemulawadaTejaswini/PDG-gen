import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		
		if(N%2==1) {
			System.out.println(0);
			return;
		}
		
		//偶数のときだけ
		long ans = 0;
		
//		for(int i=1;i<=18;i++) {
//			long r = (long)Math.pow(10, i);
//			long rem = N/r;
//			ans += rem;						
//		}
		ans = N/10;

		long num5 = 0;
		long r = 10;
		while(r*5<=N) {
			r *= 5;
			long rem = N/r;
			num5 += rem;						
		}
		ans += num5;
		System.out.println(ans);
	}
}
