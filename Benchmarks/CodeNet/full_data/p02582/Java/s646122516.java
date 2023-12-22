import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int ans = 0;
		
		if(s.charAt(0) == 'R') {
			if(s.charAt(1) == 'R') {
				if(s.charAt(2) == 'R') {
					System.out.println(3);
				}else {
					System.out.println(2);
				}
			}else {
				System.out.println(1);
			}
		}else if(s.charAt(1) == 'R') {
			if(s.charAt(2) == 'R') {
				System.out.println(2);
			}else {
				System.out.println(1);
			}
		}else if(s.charAt(2) == 'R') {
			System.out.println(1);
		}else {
			System.out.println(0);
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
 
