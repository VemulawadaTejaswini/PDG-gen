import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ; i< n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			a[i] = a[i]/2;
		}
		long L = Lcm(n,a);
		if(L == 0) {
			System.out.println(0);
		}
		else {
		long ans = (long)(k + L) /(2* L);
		
		System.out.println(ans);
		}
	}
	
	static long Lcm(int n, int []a) {
		long lcm = a[0];
		int tmp = 0;
		
		for(int i = 1 ; i < n; i++) {
			int cnt = 0;
			if((lcm % 2) != (a[i] % 2)) {
				return 0;
			}
			while(a[i] % 2 == 0) {
				a[i] /= 2;
				cnt++;
			}
			if(tmp != cnt && tmp != 0) {
				return 0;
			}
			if(tmp == 0) {
				tmp = cnt;
			}
			
			long temp =gcd(lcm,(long)a[i]);
			lcm = (long)lcm * a[i] / temp;

		}
		
		return lcm;
	}

	private static long gcd(long a, long  b) {
		long  temp = 0;

		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a != 0 || b != 0) {
		while (a % b != 0){
			temp = a;
			a = b;
			b = temp % b;
		}
		}
		return b;
	}
}


