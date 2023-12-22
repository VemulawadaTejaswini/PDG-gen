import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int ans = 0;
		
		for(int i=1;i<=n;i++) {
			int a = scan.nextInt();
			if(i%2==1 && a%2==1) {
				ans++;
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
 