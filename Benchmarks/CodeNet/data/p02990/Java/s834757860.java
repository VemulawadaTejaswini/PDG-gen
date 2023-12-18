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
		long kake2 = 1;
		for(i=2;i<=k;i++) {
			kake *= ((n-k+1)-i+1);
			kake /= i;
			kake2 *= k+1-i;
			kake2 /= i-1;
			if(kake > 1000000007) kake %= 1000000007;
			if(kake2 > 1000000007) kake2 %= 1000000007;
			ans = kake  * kake2;
			if(ans > 1000000007) ans %= 1000000007;
			System.out.println(ans);
		}
	}
}
