import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int d = scan.nextInt();
		int t = scan.nextInt();
		int s = scan.nextInt();
		
		if(d<=s*t) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 



