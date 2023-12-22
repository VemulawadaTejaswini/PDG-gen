import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		long sum = 0;
		long ans = 0;
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
			sum += a[i];
		}
		
		for(int i=0;i<n-1;i++) {
			sum -= a[i];
			long kari = sum*a[i]%1000000007;
			ans = (ans+kari)%1000000007;
		}
		
		System.out.println(ans);
		
		
		
		
		
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 



