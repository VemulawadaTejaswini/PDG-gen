
import java.util.Scanner;

public class Main {
	
	static int []mod;
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		mod = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		int []b = new int [n];
		int cnt = 0;
		
		for(int i = n-1 ; i >= 0 ; i--) {
			
			if(a[i] != mod[i]%2) {
				b[i] = 1;
				cnt++;
				gcd(i);
			}	
		}
		
		System.out.println(cnt);
		
		for(int i = 0 ; i < n;i++) {
			if(b[i] == 1)
				System.out.println(i+1);
		}
		
	}
	
	static void gcd (int n) {
		
		for(int i = 1 ; i*i <= n ;i++) {
			if(n % i == 0) {
				mod[i]++;
				mod[n/i]++;
			}
		}
	}
	
}


