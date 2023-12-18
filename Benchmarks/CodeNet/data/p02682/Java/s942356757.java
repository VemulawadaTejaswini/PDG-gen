
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong(), b = s.nextLong(), c = s.nextLong(), k = s.nextLong();
		long ans = 0;
		if(k > 0) {
			long temp = Math.min(k, a);
			k -= temp;
			ans += temp;
		} 
		if(k > 0) {
			long temp = Math.min(k, b);
			k -= temp;
			ans += temp * 0;
		}
		if(k > 0) {
			long temp = Math.min(k, c);
			k -= temp;
			ans += temp * -1;
		}
		System.out.println(ans);
	}

}
