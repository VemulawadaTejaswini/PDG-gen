import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a[] = new int[n];
		long ans = 0;
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=1;i<n;i++) {
			if(a[i-1] > a[i]) {
				ans += a[i-1] - a[i];
				a[i] += a[i-1] - a[i];
			}
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
 



