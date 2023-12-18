
import java.util.Scanner;

public class Main {
	
	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		char [][]c = new char [n][2];
		
		for(int i = 0 ; i < n ;i++) {
			c[i][0] = s1.charAt(i);
			c[i][1] = s2.charAt(i);
		}
		
		long []sum = new long [n];
		boolean low = false;
		
		if(c[0][0] == c[0][1]) {
			sum[0] = 3;
		}
		else {
			sum[0] = 6;
			low = true;
		}
		for(int i = 1 ; i < n ; i++) {
			
			if(c[i][0] == c[i-1][0]) {
				continue;
			}
			if(c[i][0] == c[i][1]) {
				sum[i] = low ? 1 : 2;
				if(sum[i]== 1) low = false;
			}
			else {
				sum[i] = low ? 3 : 2;
				low = true;
			}
		}
		
		
		long ans = 1L;
		
		for(int i = 0 ; i < n ;i++) {
			if(sum[i] == 0) continue;
			ans = ans * sum[i] % mod;
		}
		
		System.out.println(ans);
	}

}
