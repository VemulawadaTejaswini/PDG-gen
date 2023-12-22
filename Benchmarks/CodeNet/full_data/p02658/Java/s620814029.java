import java.math.BigDecimal;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.nextLine();
		long b = 0;
		long ans = 1;
		long  c = (long)Math.pow(10, 18);
		for (int i=0; i<n; i++) {
			b = sc.nextLong();
			if (b == 0) {
				ans = 0;
				break;
			}
			long ans2 = Long.MAX_VALUE;
			if(new BigDecimal(ans).multiply(new BigDecimal(b)).compareTo(new BigDecimal(ans2)) == -1) {
				ans *= b ;
			} else {
				ans = ans2;
			}
			if (ans > c || ans < 0) {
				ans = -1;
			}
		}
		sc.close();

		System.out.println(ans);
	}
}


