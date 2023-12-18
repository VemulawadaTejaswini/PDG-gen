import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		long ans = 0;
		
		if(m < n) {
			int tmp = m;
			m = n;
			n = tmp;
		}
		
		long tmp = m - n;
		long r = (long)Math.pow(10,  9) + 7;
		
		if(tmp > 1)ans = 0;
		else{
			ans = 1;
			for(int i = 2; i <= n; ++i) {
				ans %= r;
				ans *= i;
			}
			ans %= r;
			long tmp2 = ans;
			if(tmp == 1) {
				tmp2 *= m;
				tmp2 %= r;
				ans = ans * tmp2;
			}
			else {
				ans *= tmp2;
				ans %= r;
				ans *= 2;
			}
			ans %= r;
		}
		
		System.out.println(ans);
	}

}
