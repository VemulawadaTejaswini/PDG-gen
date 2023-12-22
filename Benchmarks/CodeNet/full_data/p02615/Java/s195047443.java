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
		
		Arrays.sort(a);
		
		ans += a[a.length-1];
		
		int oppai = a.length-2;
		
		boolean second = false;
		for(int i=a.length-2;i >= 1;i--) {
			ans += a[oppai];
			
			if(second == true) {
				second = false;
				oppai -= 1;
			}else {
				second = true;
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
 