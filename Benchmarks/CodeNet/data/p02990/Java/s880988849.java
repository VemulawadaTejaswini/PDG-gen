import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		long i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		sc.close();
		long ans = n-k+1;
		System.out.println(ans);
		long kake = ans;
		for(i=2;i<=k;i++) {
			kake *= ((n-k+1)-i+1);
			kake /= i;
			if(kake > 1000000007) kake %= 1000000007;
			ans = kake  * fact(k - i + 1);
			if(ans > 1000000007) ans %= 1000000007;
			System.out.println(ans);
		}
	}
	static long fact(long n) {
		if(n == 0) return 1;
		if(n == 1) return 1;
		return fact(n-1)*n;
	}
}