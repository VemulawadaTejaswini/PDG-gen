
import java.util.Scanner;

public class Main {
	
	public static final long MOD = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l = sc.next();
		
		long ans = 1;
		long pow = 1;
		int n = l.length();
		

		
		for (int i=0;i<n;i++) {
			if (l.charAt(n-i-1)=='1') {
				ans = (ans*2+pow)%MOD;
			}
			pow = pow*3%MOD;
		}

		System.out.println(ans);
	}

	

}


