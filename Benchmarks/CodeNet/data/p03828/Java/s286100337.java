import java.util.HashMap;
import java.util.Scanner;
public class Main{
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		int p = 1000000007;
		
		for(int i = 1 ; i <= n ; i++) {
			hm.put(i, gcd(n,i));
		}
		long ans = 1;
		for(int i = 1 ; i <= n ; i++) {
			ans *= (hm.get(i)+1);  
			if(ans >= p) {
				ans = ans % p;
			}
		}
		System.out.println(ans);
	}
	private static int gcd (int n, int m ) {
		if(m == 1 || !prime(m))
			return 0;
		int count = 1;
		for(int i = m+1 ; i <= n ;i++) {
			int temp = i;
			while(temp % m == 0) {
				count++;
				temp = temp/m;
			}
		}
		return count;
	}
	
	private static boolean prime(int n) {
		if(n == 1)
			return false;
		
		if(n == 2 || n == 3) {
			return true;
		}
		double p = Math.sqrt(n);
		int temp = -1;
		
		for(int i = 2 ; i <= p ; i++) {
			if(n % i == 0) {
				temp = 0;
				break;
			}
		}
		if(temp == 0) {
			return false;
		}
		return true;
		}
	
	}

